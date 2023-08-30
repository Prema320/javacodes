package com.xworkz.abstrainter.shoot;

public class Mobile {
	
	Charger charger;
	
	public void call() {
		System.out.println("invoke call in mobile");
		this.charger.power();
	}
	
	public void setCharger(Charger charger) {
		this.charger=charger;
	}

}
