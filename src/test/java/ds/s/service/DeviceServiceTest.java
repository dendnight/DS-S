package ds.s.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:application-context.xml")
public class DeviceServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private UserService userService;

	@Test
	public void login() {
		try {
			System.out.println(userService.login("123123123213215"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void sign() {
		System.out.println(userService.sign("123123123213215", "dendnight"));
	}

}
