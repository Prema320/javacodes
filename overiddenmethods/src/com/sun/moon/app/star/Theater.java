package com.sun.moon.app.star;

public class Theater {
	public String ownerName;
	public String theaterName;
	public String movie  ;
	public int noOfseats;
	public boolean beautiful;
	
	public void see() {
		System.out.println("invoking see in theater");
	}

	public void see(String ownerName) {
		System.out.println("invoking string in theater");
	}
	public void see(String ownerName,String theaterName) {
		System.out.println("invoking string,string in theater");
	}
	public void see(String ownerName,String theaterName,String movie) {
		System.out.println("invoking string,string,string in theater");
	}
	public void see(String ownerName,String theaterName,String movie,int noOfseats) {
		System.out.println("invoking string,string,string,int in theater");
	}
	public void see(String ownerName,String theaterName,String movie,int noOfseats,boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in theater");
	}

}
