package com.lying.examplemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lying.examplemybatis.dao")
public class ExampleMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMybatisApplication.class, args);
	}
}
