package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component("teacher")
public class ScienceTeacher implements Teacher{

	public ScienceTeacher() {
		System.out.println("Science Teacher constructor ....");
	}
	public void teach() {

		System.out.println("Science Teacher teaches Science ");
		
	}

}
