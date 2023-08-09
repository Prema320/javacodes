package com.sun.moon.app.star;

public class TajHotel extends Hotel{

	@Override
	public void rest() {
		System.out.println("invoking string,string,string,int,float in hotel");
	}

	@Override
	public void rest(String ownerName) {
		System.out.println("invoking string in tajhotel");
	}

	@Override
	public void rest(String ownerName, String hotelName) {
		System.out.println("invoking string,string in tajhotel");
		
	}

	@Override
	public void rest(String ownerName, String hotelName, String color) {
		System.out.println("invoking string,string,string in tajhotel");
		
	}

	@Override
	public void rest(String ownerName, String hotelName, String color, int noOfRooms) {
		System.out.println("invoking string,string,string,int in tajhotel");
		
	}

	@Override
	public void rest(String ownerName, String hotelName, String color, int noOfRooms, float rent) {
		System.out.println("invoking string,string,string,int,float in tajhotel");
		
	}
	

}
