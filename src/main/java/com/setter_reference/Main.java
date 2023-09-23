package com.setter_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/setter_reference/config.xml");
		
		Student student = context.getBean("std1",Student.class);
		System.out.print(student);
	}
}
