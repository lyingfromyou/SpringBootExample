package com.lying.examplejdbc;

import com.lying.examplejdbc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleJdbcApplicationTests {

	@Autowired
	private UserService userService;

	@Before
	public void setUp() {
		// 准备，清空user表
		userService.deleteAllUsers();
	}

	@Test
	public void contextLoads() {
		System.err.println(userService.getAllUsers());
		System.err.println("");
		userService.create("Lee", 24);
		userService.create("Bryant", 39);
		userService.create("Jame", 33);
		userService.create("cure", 28);
		userService.create("Mic", 38);

		System.err.println(userService.getAllUsers());
		System.err.println("");
		userService.deleteByName("Mic");
		System.err.println(userService.getAllUsers());
		System.err.println("");



	}

}
