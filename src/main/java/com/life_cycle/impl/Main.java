package com.life_cycle.impl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String [] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/life_cycle/impl/config.xml");
		context.registerShutdownHook();
		
		Student student = context.getBean("std1",Student.class);
		System.out.println(student);
	}
}
