package com.app;

public class Ground {
	public String name;
	public String location;
	public int noOfGrounds;
	public  int noOfGates;
	
	public Ground(String name,String location,int noOfGates,int noOfGrounds) {
		this.name=name;
		this.location=location;
		this.noOfGates=noOfGates;
		this.noOfGrounds=noOfGrounds;
		System.out.println("all args const of ground");
		
	}

}
