package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spel/config.xml");
		
		Calculator calculator = context.getBean("calculator",Calculator.class);
		System.out.print(calculator);
	}
}
