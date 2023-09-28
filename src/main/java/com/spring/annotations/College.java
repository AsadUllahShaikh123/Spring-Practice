package com.spring.annotations;



public class College {

	private Principal principal;	
	
//	public College(Principal principal) {
//		this.principal = principal;
//		principal.pricipalInfo();
//		System.out.println("Constructor inside College ...");
//	}
	
	public void setPrincipal(Principal principal) {
		System.out.println("Setter Injection ...");
		this.principal = principal;
		principal.pricipalInfo();
	}
	
}
