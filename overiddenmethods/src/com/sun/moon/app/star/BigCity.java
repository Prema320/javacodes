package com.sun.moon.app.star;

public class BigCity extends City{

	@Override
	public void beauty() {
		System.out.println("invoking beauty in bigcity");
	 	 
		
		super.beauty();
	}

	@Override
	public void beauty(String cityName) {
		System.out.println("invoking string in bigcity");
	 	 
		
		super.beauty(cityName);
	}

	@Override
	public void beauty(String cityName, String oldName) {
		System.out.println("invoking string,string in bigcity");
	 	 
		
		super.beauty(cityName, oldName);
	}

	@Override
	public void beauty(String cityName, String oldName, String famousAreaName) {
		System.out.println("invoking string,string,string in bigcity");
	 	 
		
		super.beauty(cityName, oldName, famousAreaName);
	}

	@Override
	public void beauty(String cityName, String oldName, String famousAreaName, int noOfArea) {
		System.out.println("invoking string,string,string,int in bigcity");
	 	 
		
		super.beauty(cityName, oldName, famousAreaName, noOfArea);
	}

	@Override
	public void beauty(String cityName, String oldName, String famousAreaName, int noOfArea, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in bigcity");
	 	 
		
		super.beauty(cityName, oldName, famousAreaName, noOfArea, beautiful);
	}

}
