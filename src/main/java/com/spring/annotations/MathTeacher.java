package com.spring.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher{

	
	public void teach() {
		System.out.println("Math Teacher teaches Math Subject ");		
	}

}
