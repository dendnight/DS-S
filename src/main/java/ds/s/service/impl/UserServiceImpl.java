package ds.s.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ds.s.mapper.DeviceMapper;
import ds.s.mapper.UserMapper;
import ds.s.model.Device;
import ds.s.model.DeviceExample;
import ds.s.model.User;
import ds.s.service.UserService;

/**
 * 
 * <pre>
 * Description
 * Copyright:	Copyright (c)2013  
 * Company:		DENDNIGHT
 * Author:		dendnight
 * Version:		1.0  
 * Create at:	2013年11月24日 下午8:03:00  
 *  
 * 修改历史:
 * 日期    作者    版本  修改描述
 * ------------------------------------------------------------------
 * 
 * </pre>
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private DeviceMapper deviceMapper;

	@Autowired
	private UserMapper userMapper;

	public User login(String imei) {
		DeviceExample example = new DeviceExample();
		example.createCriteria().andImeiEqualTo(imei);
		List<Device> list = deviceMapper.selectByExample(example);

		if (null == list || 0 == list.size()) {
			return null;
		}

		return userMapper.selectByPrimaryKey(list.get(0).getUserId());
	}

	public User sign(String imei, String nickname) {

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
}
