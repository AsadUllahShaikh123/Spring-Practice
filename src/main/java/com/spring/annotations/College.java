package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {

//	public College(Principal principal) {
//	this.principal = principal;
//	principal.pricipalInfo();
//	System.out.println("Constructor inside College ...");
//}

	@Autowired
	private Principal principal;

	private Teacher teacher;

	public College() {
		System.out.println("College Constructor ..... ");
	}

	@Autowired
	@Qualifier("teacher")
	public void setTeacher(Teacher teacher) {

		this.teacher = teacher;
		System.out.println("Teacher Setter .... ");
	}

	public void info() {
		principal.pricipalInfo();
		teacher.teach();
	}

}
