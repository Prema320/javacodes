package com.sun.moon.app.star;

public class BigPub extends Pub{

	@Override
	public void dance() {
		System.out.println("invoking dance in bigpub");
   	 
		super.dance();
	}

	@Override
	public void dance(String pubName) {
		System.out.println("invoking string in bigpub");
	   	 
		super.dance(pubName);
	}

	@Override
	public void dance(String pubName, String ownerName) {
		System.out.println("invoking string,string in bigpub");
	   	 
		super.dance(pubName, ownerName);
	}

	@Override
	public void dance(String pubName, String ownerName, String managerName) {
		System.out.println("invoking string,string,string in bigpub");
	   	 
		super.dance(pubName, ownerName, managerName);
	}

	@Override
	public void dance(String pubName, String ownerName, String managerName, int cost) {
		System.out.println("invoking string,string,string,int in bigpub");
	   	 
		super.dance(pubName, ownerName, managerName, cost);
	}

	@Override
	public void dance(String pubName, String ownerName, String managerName, int cost, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in bigpub");
	   	 
		super.dance(pubName, ownerName, managerName, cost, beautiful);
	}

}
