package com.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String [] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor_injection/config.xml");
		
		// This is responsible for calling destroy method.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/constructor_injection/config.xml");
		context.registerShutdownHook();
		Student student = context.getBean("std1",Student.class);
		System.out.println(student);
	}
}
