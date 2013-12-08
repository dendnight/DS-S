package ds.s.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import ds.s.model.User;

@ContextConfiguration("classpath:application-context.xml")
public class DeviceServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private UserService userService;

	@Test
	public void login() {
		try {
			User user = new User();
			System.out.println(userService.findUser(user));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void register() {
		// try {
		// // System.out.println(userService.register("123123123213215",
		// // "dendnight"));
		// } catch (MsgException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
