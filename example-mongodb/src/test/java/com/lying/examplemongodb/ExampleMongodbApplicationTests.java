package com.lying.examplemongodb;

import com.lying.examplemongodb.domain.User;
import com.lying.examplemongodb.report.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleMongodbApplicationTests {
	@Autowired
	private UserRepository userRepository;


	@Before
	public void setUp() {
		userRepository.deleteAll();
	}

	@Test
	public void contextLoads() {
		userRepository.save(new User(1L, "lee", 24));
		userRepository.save(new User(2L, "LIU", 17));
		userRepository.save(new User(3L, "XZ", 21));
		userRepository.save(new User(4L, "ZQ", 29));

		System.err.println(userRepository.findAll());

		userRepository.deleteById(2L);

		System.err.println(userRepository.findAll());

		System.err.println(userRepository.findByUsername("ZQ"));

	}

}
