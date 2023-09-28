package com.spring.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.annotations")
public class Config {
	public Config() {
		System.out.print("Config");
	}

}
