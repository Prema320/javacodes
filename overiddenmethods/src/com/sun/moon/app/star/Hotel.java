package com.sun.moon.app.star;

public class Hotel {
	public String ownerName;
	public String hotelName;
	public String color ;
	public int noOfRooms;
	public float rent;
	
	public void rest() {
		System.out.println("invoking rest in hotel");
	}

	public void rest(String ownerName) {
		System.out.println("invoking string in hotel");
	}
	public void rest(String ownerName,String hotelName) {
		System.out.println("invoking string,string in hotel");
	}
	public void rest(String ownerName,String hotelName,String color) {
		System.out.println("invoking string,string,string in hotel");
	}
	public void rest(String ownerName,String hotelName,String color,int noOfRooms) {
		System.out.println("invoking string,string,string,int in hotel");
	}
	public void rest(String ownerName,String hotelName,String color,int noOfRooms,float rent) {
		System.out.println("invoking string,string,string,int,float in hotel");
	}

}
