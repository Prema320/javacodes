package com.xworkz.abstrainter.shoot;

public class Custom {
	
	PassportVerification verification;
	
	public void verify() {
		System.out.println("invoke verify in custom");
		this.verification.move();
		this.verification.seen();
	}
	
	public void setPassportVerification(PassportVerification verification) {
		this.verification=verification;
		
	}

}
