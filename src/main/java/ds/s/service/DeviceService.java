package ds.s.service;

import ds.s.model.Device;

public interface DeviceService {

	/**
	 * 添加设备信息
	 * 
	 * @param devices
	 * @return
	 */
	int add(Device device);

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	Device query(Integer id);

	/**
	 * 按IMEI查询
	 * 
	 * @param imei
	 * @return
	 */
	Device query(String imei);
}
