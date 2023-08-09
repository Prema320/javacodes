package com.sun.moon.app.star;

public class SmallPoliceStation extends PoliceStation{

	@Override
	public void job() {
		System.out.println("invoking job in smallpolicestation");
	   	 
		super.job();
	}

	@Override
	public void job(String stationName) {
		System.out.println("invoking string in smallpolicestation");
	   	 
		super.job(stationName);
	}

	@Override
	public void job(String stationName, String oldName) {
		System.out.println("invoking string,string in smallpolicestation");
	   	 
		super.job(stationName, oldName);
	}

	@Override
	public void job(String stationName, String oldName, String policeName) {
		System.out.println("invoking string,string,string in smallpolicestation");
	   	 
		super.job(stationName, oldName, policeName);
	}

	@Override
	public void job(String stationName, String oldName, String policeName, int age) {
		System.out.println("invoking string,string,string,int in smallpolicestation");
	   	 
		super.job(stationName, oldName, policeName, age);
	}

	@Override
	public void job(String stationName, String oldName, String policeName, int age, boolean sensior) {
		System.out.println("invoking string,string,string,int,boolean in smallpolicestation");
	   	 
		super.job(stationName, oldName, policeName, age, sensior);
	}

}
