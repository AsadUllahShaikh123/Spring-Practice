package com.spring.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.spring.java_config")
public class Config {

	@Bean
	public Address getAddress() {
		return new Address("Moro");
	}
	
	@Bean
	@Primary
	public Address getAdd() {
		return new Address("Jamshoro");
	}
	@Bean
	public Student getStudent() {
		return new Student(1,"Asad");
	}
}

