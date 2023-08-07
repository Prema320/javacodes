package com.app.sun.moon.star;

public class Hotel {
	public String hotelName;
	public boolean tasty;
	public void cook() {
		System.out.println("invoking no args of method");
	}
	public void cook(String hotelName) {
		System.out.println("invoking string args of method");
		System.out.println("hotelName"+hotelName);
		cook();
		cook(true);
		cook("sonu",false);
	}
	public void cook(boolean tasty) {
		System.out.println("invoking boolean args of method");
		System.out.println("tasty"+tasty);
	}
	public void cook(String hotelName,boolean tasty) {
		System.out.println("invoking string,boolean args of method");
		System.out.println("hotelName"+hotelName);
		System.out.println("tasty"+tasty);
	}

}
