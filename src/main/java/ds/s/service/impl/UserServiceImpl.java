package ds.s.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

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
 * Create at:	2013��11��24�� ����8:03:00  
 *  
 * �޸���ʷ:
 * ����    ����    �汾  �޸�����
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

		// ��֤����
		if (StringUtils.isEmpty(imei)) {
			throw new RuntimeException("��������!");
		}

		DeviceExample deviceExample = new DeviceExample();
		deviceExample.createCriteria().andImeiEqualTo(imei);
		List<Device> list = deviceMapper.selectByExample(deviceExample);

		if (null == list || 0 == list.size()) {
			return null;
		}

		return userMapper.selectByPrimaryKey(list.get(0).getUserId());
	}

	public User register(String imei, String nickname) {

		// ��֤����
		if (StringUtils.isEmpty(imei) || StringUtils.isEmpty(nickname)) {
			throw new RuntimeException("��������!");
		}

		// ��֤�豸
		DeviceExample deviceExample = new DeviceExample();
		deviceExample.createCriteria().andImeiEqualTo(imei);
		List<Device> list = deviceMapper.selectByExample(deviceExample);

		if (null != list && 0 < list.size() && null != list.get(0).getUserId()) {
			throw new RuntimeException("�豸�Ѱ��û�!");
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
}
