package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		College college = context.getBean("college",College.class);
		college.info();
		((AnnotationConfigApplicationContext)context).close();
	}
}
