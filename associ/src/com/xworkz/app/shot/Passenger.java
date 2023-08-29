package com.xworkz.app.shot;

public class Passenger {

	public String name;
	public Bus bus;
	
	public Passenger(String name) {
		this.name=name;
	}
	
	public void setBus(Bus bus) {
		this.bus=bus;
	}
	
	public void travel() {
		System.out.println("passenger can travel");
		this.bus.transport();
	}
}
