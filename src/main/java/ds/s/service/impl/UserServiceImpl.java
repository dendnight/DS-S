package ds.s.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import ds.s.exception.MsgException;
import ds.s.mapper.DeviceMapper;
import ds.s.mapper.UserMapper;
import ds.s.model.Device;
import ds.s.model.DeviceExample;
import ds.s.model.User;
import ds.s.model.UserExample;
import ds.s.service.UserService;

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
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource
	private DeviceMapper deviceMapper;

	@Resource
	private UserMapper userMapper;

	public User login(String imei) {

		// 验证参数
		if (StringUtils.isEmpty(imei) || imei.length() > 15) {
			throw new RuntimeException("参数错误");
		}

		DeviceExample deviceExample = new DeviceExample();
		deviceExample.createCriteria().andImeiEqualTo(imei);
		List<Device> list = deviceMapper.selectByExample(deviceExample);

		if (null == list || 0 == list.size()) {
			return null;
		}

		return userMapper.selectByPrimaryKey(list.get(0).getUserId());
	}

	public User register(String imei, String nickname) throws MsgException {

		// 验证参数
		if (StringUtils.isEmpty(imei) || StringUtils.isEmpty(nickname) || imei.length() > 15 || nickname.length() > 12) {
			throw new RuntimeException("参数错误");
		}

		// 验证昵称
		if (!checkNickname(nickname)) {
			throw new MsgException("昵称已存在");
		}

		Device device = new Device();
		device.setImei(imei);
		deviceMapper.insertSelective(device);

		User user = new User();
		user.setDeviceId(device.getId());
		user.setNickname(nickname);

		userMapper.insertSelective(user);

		DeviceExample example = new DeviceExample();
		example.createCriteria().andIdEqualTo(device.getId());
		device.setUserId(user.getId());

		deviceMapper.updateByExampleSelective(device, example);

		return user;
	}

	public boolean checkNickname(String nickname) {

		UserExample userExample = new UserExample();
		userExample.createCriteria().andNicknameEqualTo(nickname);
		List<User> list = userMapper.selectByExample(userExample);
		if (null != list && 0 < list.size()) {
			return false;
		}
		return true;
	}

	@Override
	public void renickname(String imei, String nickname) throws MsgException {

		// 验证参数
		if (StringUtils.isEmpty(imei) || StringUtils.isEmpty(nickname) || imei.length() > 15 || nickname.length() > 12) {
			throw new RuntimeException("参数错误");
		}

		// 验证昵称
		if (!checkNickname(nickname)) {
			throw new MsgException("昵称已存在");
		}

		// 修改昵称
		User user = login(imei);
		userMapper.updateByPrimaryKeySelective(user);
	}
}
