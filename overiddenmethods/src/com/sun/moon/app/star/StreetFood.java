package com.sun.moon.app.star;

public class StreetFood  extends Street{

	@Override
	public void eat() {
		System.out.println("invoking eat in streetfood");
	   	 
		super.eat();
	}

	@Override
	public void eat(String streetName) {
		System.out.println("invoking string in streetfood");
	   	 
		super.eat(streetName);
	}

	@Override
	public void eat(String streetName, String foodName) {
		System.out.println("invoking string,string in streetfood");
	   	 
		super.eat(streetName, foodName);
	}

	@Override
	public void eat(String streetName, String foodName, String itemName) {
		System.out.println("invoking string,string,string in streetfood");
	   	 
		super.eat(streetName, foodName, itemName);
	}

	@Override
	public void eat(String streetName, String foodName, String itemName, int noOfRoads) {
		System.out.println("invoking string,string,string,int in streetfood");
	   	 
		super.eat(streetName, foodName, itemName, noOfRoads);
	}

	@Override
	public void eat(String streetName, String foodName, String itemName, int noOfRoads, boolean clean) {
		System.out.println("invoking string,string,string,int,boolean in streetfood");
	   	 
		super.eat(streetName, foodName, itemName, noOfRoads, clean);
	}

}
