package com.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String [] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/setter_injection/config.xml");
		Student student = context.getBean("std1",Student.class);
		Student student2 = context.getBean("std2",Student.class);
		System.out.println(student);
		System.out.println(student2);
	}
}
