package ds.s.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import ds.s.model.Device;
import ds.s.service.DeviceService;

@ContextConfiguration("classpath:application-context.xml")
public class DeviceServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private DeviceService deviceService;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {

		System.out.println(1);
		Device device = new Device();
		device.setImei("12312312321321321");
		System.out.println(deviceService.add(device));

	}

}
