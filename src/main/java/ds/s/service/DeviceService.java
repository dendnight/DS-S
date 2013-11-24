package ds.s.service;

import ds.s.model.Device;

public interface DeviceService {

	/**
	 * ����豸��Ϣ
	 * 
	 * @param devices
	 * @return
	 */
	int add(Device device);

	/**
	 * ��id��ѯ
	 * 
	 * @param id
	 * @return
	 */
	Device query(Integer id);

	/**
	 * ��IMEI��ѯ
	 * 
	 * @param imei
	 * @return
	 */
	Device query(String imei);
}
