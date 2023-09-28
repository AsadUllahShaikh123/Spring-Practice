package com.spring.loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/loose_coupling/beans.xml");
		Student student = context.getBean("student",Student.class);
	    StudentImp imp = context.getBean("studentImp",StudentImp.class);
	    imp.insert(student);
	}
}
