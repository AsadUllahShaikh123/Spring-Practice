package com.setter_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private List<String> address;
	private Map<String, String> course;
	private Set<String> phno;
	
	
	public Set<String> getPhno() {
		return phno;
	}
	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", phno=" + phno
				+ "]";
	}
	
	
	
	
}
