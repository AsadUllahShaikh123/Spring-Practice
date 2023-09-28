package com.selenium;

public class Father {

	private Son son ;
	public Father() {
		System.out.println("FAther calling....");
	}
	public void setSon(Son son ) {
		System.out.println("FAther setter ..");
		this.son =son;
	}
}
