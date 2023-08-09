package com.sun.moon.app.star;

public class BigTheater extends Theater {

	@Override
	public void see() {
		System.out.println("invoking see in bigtheater");
		super.see();
	}

	@Override
	public void see(String ownerName) {
		System.out.println("invoking string in bigtheater");
		super.see(ownerName);
	}

	@Override
	public void see(String ownerName, String theaterName) {
		System.out.println("invoking string,string in bigtheater");
		super.see(ownerName, theaterName);
	}

	@Override
	public void see(String ownerName, String theaterName, String movie) {
		System.out.println("invoking string,string,string in bigtheater");
		super.see(ownerName, theaterName, movie);
	}

	@Override
	public void see(String ownerName, String theaterName, String movie, int noOfseats) {
		System.out.println("invoking string,string,string,int in bigtheater");
		super.see(ownerName, theaterName, movie, noOfseats);
	}

	@Override
	public void see(String ownerName, String theaterName, String movie, int noOfseats, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in bigtheater");
		super.see(ownerName, theaterName, movie, noOfseats, beautiful);
	}

}
