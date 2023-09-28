package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	

	@Bean
	public Principal getPrincipal() {
		return new Principal();
	}
	
	@Bean
	public College getCollege() {
		return new College(getPrincipal());
	}

}
