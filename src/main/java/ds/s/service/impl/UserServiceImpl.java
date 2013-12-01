package ds.s.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import ds.s.aaaaa.LoginInfo;
import ds.s.aaaaa.MD5;
import ds.s.exception.MsgException;
import ds.s.mapper.UserMapper;
import ds.s.model.User;
import ds.s.model.UserExample;
import ds.s.service.UserService;
import ds.s.utils.DSTools;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月28日 上午12:24:14  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
@Service("userervice")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public int add(User user) throws MsgException {
		// 验证参数
		if (null == user || StringUtils.isBlank(user.getNickname())) {
			throw new RuntimeException("参数错误");
		}

		// 验证昵称
		if (findNickname(user.getNickname())) {
			throw new MsgException("昵称已被注册");
		}

		// 通过IMEI添加
		if (StringUtils.isNotBlank(user.getImei()) && 15 >= user.getImei().length()) {
			userMapper.insertSelective(user);
			return user.getId();
		}

		// 验证帐号
		if (StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())) {
			// 验证长度
			if (12 < user.getUsername().length()) {
				throw new MsgException("帐号不能超过12个字符");
			}
			// 验证是否已经存在
			if (findUsername(user.getUsername())) {
				throw new MsgException("用户名已存在");
			}
			// 加密密码
			user.setPassword(MD5.getPassword(user.getPassword()));

			userMapper.insertSelective(user);
			return user.getId();
		}
		return 0;

	}

	@Override
	public void update(LoginInfo info, User user) throws Exception {
		// 验证是否是本人修改
		if (null == info || info.getId().intValue() != user.getId()) {
			throw new RuntimeException("参数错误");
		}
		// 验证是否存在
		User tempUser = new User();
		tempUser.setId(user.getId());
		tempUser = findUsers(tempUser);
		if (StringUtils.isBlank(tempUser.getNickname())) {
			throw new RuntimeException("用户不存在");
		}

		// 不可以修改IMEI
		user.setImei(null);
		// 不可以修改帐号
		user.setUsername(null);
		// 不可以修改删除状态
		user.setDeleted(null);

		// 修改密码需加密
		if (StringUtils.isNotBlank(user.getPassword())) {
			user.setPassword(MD5.getPassword(user.getPassword()));
		}
		user.setUpdatedTime(new Date());
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public User findUsers(User user) {
		// 验证参数
		if (null == user) {
			throw new RuntimeException("参数错误");
		}

		// IMEI登录
		if (StringUtils.isNotBlank(user.getImei())) {
			UserExample userExample = new UserExample();
			userExample.createCriteria().andNicknameEqualTo(user.getImei()).andDeletedEqualTo(0);
			List<User> list = userMapper.selectByExample(userExample);
			if (null != list && 0 < list.size()) {
				return list.get(0);
			}
		}
		// 帐号登录
		if (StringUtils.isNotBlank(user.getUsername()) && StringUtils.isNotBlank(user.getPassword())) {
			UserExample userExample = new UserExample();
			userExample.createCriteria().andNicknameEqualTo(user.getImei())
					.andPasswordEqualTo(MD5.getPassword(user.getPassword())).andDeletedEqualTo(0);
			List<User> list = userMapper.selectByExample(userExample);
			if (null != list && 0 < list.size()) {
				return list.get(0);
			}
		}

		// 根据ID获取
		if (null != user.getId()) {
			UserExample userExample = new UserExample();
			userExample.createCriteria().andIdEqualTo(user.getId()).andDeletedEqualTo(0);
			List<User> list = userMapper.selectByExample(userExample);
			if (null != list && 0 < list.size()) {
				return list.get(0);
			}
		}
		return null;
	}

	@Override
	public void delete(LoginInfo info, int id) throws MsgException {
		if (null == info || info.getId().intValue() != id) {
			throw new RuntimeException("参数错误");
		}
		// 验证是否存在
		User tempUser = new User();
		tempUser.setId(id);
		tempUser = findUsers(tempUser);
		if (StringUtils.isBlank(tempUser.getNickname())) {
			throw new MsgException("用户不存在");
		}

		User user = new User();
		// nickname改变
		user.setNickname(tempUser.getNickname() + "#" + String.format("%05d", new DSTools().getRandom(9999)));
		// imei改变
		if (StringUtils.isNotBlank(tempUser.getImei())) {
			user.setImei(tempUser.getImei() + "#" + String.format("%05d", new DSTools().getRandom(9999)));
		}

		// username改变
		if (StringUtils.isNotBlank(tempUser.getUsername())) {
			user.setImei(tempUser.getUsername() + "#" + String.format("%05d", new DSTools().getRandom(9999)));
		}
		user.setDeleted(1);
		user.setUpdatedTime(new Date());
		user.setVersion(tempUser.getVersion() + 1);

		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public boolean findNickname(String nickname) {
		if (StringUtils.isEmpty(nickname)) {
			return false;
		}

		UserExample userExample = new UserExample();
		userExample.createCriteria().andNicknameEqualTo(nickname);
		List<User> list = userMapper.selectByExample(userExample);
		if (null != list && 0 < list.size()) {
			return true;
		}
		return false;

	}

	@Override
	public boolean findUsername(String username) {
		if (StringUtils.isEmpty(username)) {
			return false;
		}

		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(userExample);
		if (null != list && 0 < list.size()) {
			return true;
		}
		return false;
	}

}
