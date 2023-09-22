package com.spring_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_practice/config.xml");
        
        Azhar asad= context.getBean("person",Azhar.class);
       
       
       asad.sleep();
     
    }
}
