package com.spring.java_config;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.java_config")
public class config {

	@Bean
	public Student getStudent() {
		return new Student();
	}
}

