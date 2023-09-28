package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component("teacher")
public class ScienceTeacher implements Teacher{

	
	public void teach() {

		System.out.println("Science Teacher teaches Science ");
		
	}

}
