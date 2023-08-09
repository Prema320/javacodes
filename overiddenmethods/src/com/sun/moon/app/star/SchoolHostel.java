package com.sun.moon.app.star;

public class SchoolHostel extends Hostel {

	@Override
	public void enjoy() {
		System.out.println("invoking enjoy in schoolhostel");
		super.enjoy();
	}

	@Override
	public void enjoy(String wardenName) {
		System.out.println("invoking string in schoolhostel");		
		super.enjoy(wardenName);
	}

	@Override
	public void enjoy(String wardenName, String hostelName) {
		System.out.println("invoking string,string in schoolhostel");
		super.enjoy(wardenName, hostelName);
	}

	@Override
	public void enjoy(String wardenName, String hostelName, String nurseName) {
		System.out.println("invoking string,string,string in schoolhostel");
		super.enjoy(wardenName, hostelName, nurseName);
	}

	@Override
	public void enjoy(String wardenName, String hostelName, String nurseName, int noOfRooms) {
		System.out.println("invoking string,string,string,int in schoolhostel");
		super.enjoy(wardenName, hostelName, nurseName, noOfRooms);
	}

	@Override
	public void enjoy(String wardenName, String hostelName, String nurseName, int noOfRooms, boolean free) {
		System.out.println("invoking string,string,string,int,boolean in schoolhostel");
		super.enjoy(wardenName, hostelName, nurseName, noOfRooms, free);
	}
	

}
