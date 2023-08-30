package com.xworkz.abstrainter.shoot;

public class AdharVerification implements PassportVerification {

	@Override
	public void move() {
		System.out.println("invoke move in adhar");
	}

	@Override
	public void seen() {
		System.out.println("invoke seen in adhar");
	}

}
