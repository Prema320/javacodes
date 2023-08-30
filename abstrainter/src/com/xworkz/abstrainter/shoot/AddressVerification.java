package com.xworkz.abstrainter.shoot;

public class AddressVerification implements PassportVerification {

	@Override
	public void move() {
		System.out.println("invoke move in addressverification");
	}

	@Override
	public void seen() {
		System.out.println("invoke seen in addressverification");
	}

}
