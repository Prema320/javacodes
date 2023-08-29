package com.xworkz.app.shot;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		Charger charger=new Charger();
		mobile.setCharger(charger);
		mobile.call();
		
	}

}
