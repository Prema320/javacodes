package com.sun.moon.app.star;

public class Hostel {
	public String wardenName;
	public String hostelName;
	public String nurseName ;
	public int noOfRooms;
	public boolean free;
	
	public void enjoy() {
		System.out.println("invoking enjoy in hostel");
	}
	
	public void enjoy(String wardenName) {
		System.out.println("invoking string in hostel");
	}
	
	public void enjoy(String wardenName,String hostelName) {
		System.out.println("invoking string,string in hostel");
		}
	 
	public void enjoy(String wardenName,String hostelName,String nurseName) {
		System.out.println("invoking string,string,string in hostel");
	}
	
	public void enjoy(String wardenName,String hostelName,String nurseName,int noOfRooms) {
		System.out.println("invoking string,string,string,int in hostel");
	}
	
	public void enjoy(String wardenName,String hostelName,String nurseName,int noOfRooms,boolean free) {
		System.out.println("invoking string,string,string,int,boolean in hostel");
	}
}
