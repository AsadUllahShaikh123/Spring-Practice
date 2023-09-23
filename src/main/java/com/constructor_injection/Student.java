package com.constructor_injection;

public class Student {

	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name) {
		System.out.println("Int , String");
		this.id = id;
		this.name= name;
	}
	public Student(String name , int id) {
		System.out.println("String , INt");
		this.id= id;
		this.name = name;
	}
	public Student(String name, String address) {
		System.out.println("String, String");
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}