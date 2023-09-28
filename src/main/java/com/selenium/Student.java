package com.selenium;

public class Student implements Person {

	
	private Father father;
	public Student() {
		System.out.println("STudent Constructor .... ");
	}
	public void setFather(Father father) {
		System.out.println("Student setter ....");
		this.father = father;
	}
	public void qualification() {
		System.out.println("Graduated .... ");		
		
	}

	
}
