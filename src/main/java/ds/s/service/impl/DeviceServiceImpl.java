package ds.s.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ds.s.mapper.DeviceMapper;
import ds.s.model.Device;
import ds.s.model.DeviceExample;
import ds.s.service.DeviceService;

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
@Service
public class DeviceServiceImpl implements DeviceService {

	DeviceMapper deviceMapper;

	public int add(Device device) {
		deviceMapper.insertSelective(device);
		return 0;
	}

	public Device query(Integer id) {
		return deviceMapper.selectByPrimaryKey(id);
	}

	public Device query(String imei) {
		// imeiΪ��ֱ�ӷ���null
		if (null == imei || "".equals(imei.trim())) {
			return null;
		}

		DeviceExample example = new DeviceExample();
		example.createCriteria().andImeiEqualTo(imei);
		List<Device> list = deviceMapper.selectByExample(example);

		// listΪ��ֱ�ӷ���null
		if (null == list || 0 == list.size()) {
			return null;
		}

		// �����±�Ϊ0�Ķ��� FIXME ��Ψһ?...
		return list.get(0);
	}
}
