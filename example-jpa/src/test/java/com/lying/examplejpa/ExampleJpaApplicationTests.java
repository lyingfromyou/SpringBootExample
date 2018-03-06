package com.lying.examplejpa;

import com.lying.examplejpa.domain.User;
import com.lying.examplejpa.report.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleJpaApplicationTests {


	@Autowired
	private UserRepository repository;

	@Test
	public void contextLoads() {
		User u1 = new User(null, "Lying", 24);
		repository.save(u1);
		System.err.println(repository.findAll());

	}

}
