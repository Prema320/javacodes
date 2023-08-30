package com.xworkz.abstrainter.shoot;

public class CustomRunner {

	public static void main(String[] args) {
		PassportVerification passportVerification =new AddressVerification();
			Custom custom=new Custom();
			custom.setPassportVerification(passportVerification);
			custom.verify();
			
	}

}
