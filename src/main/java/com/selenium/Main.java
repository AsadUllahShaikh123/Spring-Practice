package com.selenium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/selenium/config.xml");
//		Person person = context.getBean("person",Person.class);
//		person.qualification();
		
		
	}
}
