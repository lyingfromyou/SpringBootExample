package com.lying.examplefreemarker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lying.examplefreemarker.dao")
public class ExampleFreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleFreemarkerApplication.class, args);
	}
}
