package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

//	public College(Principal principal) {
//	this.principal = principal;
//	principal.pricipalInfo();
//	System.out.println("Constructor inside College ...");
//}

	@Value("${college.name}")
	String collegeName;
	@Autowired
	private Principal principal;

	private Teacher teacher;

	
	@Autowired
	@Qualifier("teacher")
	public void setTeacher(Teacher teacher) {

		this.teacher = teacher;
	}

	public void info() {
		System.out.println("My College Name is " + collegeName);
		principal.pricipalInfo();
		teacher.teach();
	}

}
