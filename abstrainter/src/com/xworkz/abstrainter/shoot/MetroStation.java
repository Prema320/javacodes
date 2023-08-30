package com.xworkz.abstrainter.shoot;

public class MetroStation {
	
	Metro metro;
	
	public void stationary() {
		System.out.println("invoke stationary in metrostation");
		this.metro.stop();
		
	}
	
	public void setMetro(Metro metro) {
		this.metro=metro;
	}

}
