package com.sun.moon.app.star;

public class MysoreZoo extends Zoo{

	@Override
	public void saw() {
		System.out.println("invoking saw in mysorezoo");
	   	 
		super.saw();
	}

	@Override
	public void saw(String zooName) {
		System.out.println("invoking string in mysorezoo");
		super.saw(zooName);
	}

	@Override
	public void saw(String zooName, String animalName) {
		System.out.println("invoking string,string in mysorezoo");
		super.saw(zooName, animalName);
	}

	@Override
	public void saw(String zooName, String animalName, String color) {
		System.out.println("invoking string,string,string in mysorezoo");
		super.saw(zooName, animalName, color);
	}

	@Override
	public void saw(String zooName, String animalName, String color, int noOflegs) {
		System.out.println("invoking string,string,string,int in mysorezoo");
		super.saw(zooName, animalName, color, noOflegs);
	}

	@Override
	public void saw(String zooName, String animalName, String color, int noOflegs, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in mysorezoo");
		super.saw(zooName, animalName, color, noOflegs, beautiful);
	}

}
