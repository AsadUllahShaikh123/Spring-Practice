package com.life_cycle.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	private int id;
	private String name;
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
	public void destroy() throws Exception {
		System.out.println("Destory ()");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init ()");		
	}
	public String toString() {
		return "id : "+id + " name : " + name;
	}
	
	
}
