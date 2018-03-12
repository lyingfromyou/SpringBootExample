package com.lying.exampleredis;

import com.lying.exampleredis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleRedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void contextLoads() throws UnsupportedEncodingException {
		User user = new User("超人", 25);
		redisTemplate.opsForValue().set(new String(user.getUsername().getBytes(), "utf-8"), user);
		System.err.println(redisTemplate.opsForValue().get("超人"));
	}

}
