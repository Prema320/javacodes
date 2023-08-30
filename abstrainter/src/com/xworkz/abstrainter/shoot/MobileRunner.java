package com.xworkz.abstrainter.shoot;

public class MobileRunner {

	public static void main(String[] args) {
		Charger charger=new Adaptor();
		Mobile mobile=new Mobile();
		mobile.setCharger(charger);
		mobile.call();
		Charger charger1=new Wire();
		charger1.power();
		
	}

}
