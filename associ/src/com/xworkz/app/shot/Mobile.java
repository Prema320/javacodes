package com.xworkz.app.shot;

public class Mobile {

	public Charger charger;

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void call() {
		System.out.println("mobile can be used for calling");
		this.charger.adaptor();
		this.charger.cabel();
		this.charger.charge();
		this.charger.energy();
	}

}
