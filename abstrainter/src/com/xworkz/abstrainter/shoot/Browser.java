package com.xworkz.abstrainter.shoot;


public class Browser {
	
	public Internet internet;
	
	public void connect() {
		System.out.println("invoking connect in browser");
		this.internet.supply();
		this.internet.connecting();
	}
	
	public void setInternet( Internet internet) {
		this.internet=internet;
	}
	
	
}
