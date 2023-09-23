package com.constructor_injection;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String address;
	private List<String> courses;
	private Certificate certificate;

//	public Student(int id, String name) {
//		System.out.println("Int , String");
//		this.id = id;
//		this.name= name;
//	}
//	public Student(String name , int id) {
//		System.out.println("String , INt");
//		this.id= id;
//		this.name = name;
//	}
//	public Student(String name, String address) {
//		System.out.println("String, String");
//		this.name = name;
//		this.address = address;
//	}

	public Student(int id, String name, String address, List<String> courses, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses
				+ ", certificate=" + certificate + "]";
	}

	public void init() {
		System.out.println("Hello from Init Method ");
	}
	public void destroy() {
		System.out.println("Destroy Method()");
	}
	

}