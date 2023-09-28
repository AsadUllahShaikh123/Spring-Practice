package com.spring.annotations;



public class College {

	private Principal principal;	
	
	private Teacher teacher;
	
//	public College(Principal principal) {
//		this.principal = principal;
//		principal.pricipalInfo();
//		System.out.println("Constructor inside College ...");
//	}
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		principal.pricipalInfo();
	}
	public void setTeacher(Teacher teacher) {
		
		this.teacher = teacher;
		teacher.teach();
	}
	
}
