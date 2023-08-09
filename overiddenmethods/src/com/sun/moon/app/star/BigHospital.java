package com.sun.moon.app.star;

public class BigHospital extends Hospital {

	@Override
	public void treatment() {
		System.out.println("invoking treatment in bighospital");
		super.treatment();
	}

	@Override
	public void treatment(String ownerName) {
		System.out.println("invoking string in bighospital");
				super.treatment(ownerName);
	}

	@Override
	public void treatment(String ownerName, String hospitalName) {
		System.out.println("invoking string,string in bighospital");
		super.treatment(ownerName, hospitalName);
	}

	@Override
	public void treatment(String ownerName, String hospitalName, String docterName) {
		System.out.println("invoking string,string,string in bighospital");
		super.treatment(ownerName, hospitalName, docterName);
	}

	@Override
	public void treatment(String ownerName, String hospitalName, String docterName, int noOfRooms) {
		System.out.println("invoking string,string,string,int in bighospital");
		super.treatment(ownerName, hospitalName, docterName, noOfRooms);
	}

	@Override
	public void treatment(String ownerName, String hospitalName, String docterName, int noOfRooms, float fees) {
		System.out.println("invoking string,string,string,int,float in bighospital");
		super.treatment(ownerName, hospitalName, docterName, noOfRooms, fees);
	}
	

}
