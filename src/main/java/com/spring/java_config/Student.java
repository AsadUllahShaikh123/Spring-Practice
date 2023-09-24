package com.spring.java_config;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String name;
	@Autowired
	private Address address;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
