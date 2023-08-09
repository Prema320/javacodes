package com.sun.moon.app.star;

public class Hospital {
	public String ownerName;
	public String hospitalName;
	public String docterName ;
	public int noOfRooms;
	public float fees;
	

	public void treatment() {
		System.out.println("invoking treatment in hospital");
	}

	public void treatment(String ownerName) {
		System.out.println("invoking string in hospital");
	}
	public void treatment(String ownerName,String hospitalName) {
		System.out.println("invoking string,string in hospital");
	}
	public void treatment(String ownerName,String hospitalName,String docterName) {
		System.out.println("invoking string,string,string in hospital");
	}
	public void treatment(String ownerName,String hospitalName,String docterName,int noOfRooms) {
		System.out.println("invoking string,string,string,int in hospital");
	}
	public void treatment(String ownerName,String hospitalName,String docterName,int noOfRooms,float fees) {
		System.out.println("invoking string,string,string,int,float in hospital");
	}

}
