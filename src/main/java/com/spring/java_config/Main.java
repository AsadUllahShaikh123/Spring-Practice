package com.spring.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		Student student = context.getBean("getStudent",Student.class);
		College college = context.getBean(College.class);
		System.out.print("college : "+ college);
	}
}
