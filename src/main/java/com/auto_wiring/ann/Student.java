package com.auto_wiring.ann;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String name;
	
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Id setter ");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name setter ");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Addreess Setter");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	} 
	
	
}
