package com.app;

public class PlayGround extends Ground {
	
	public PlayGround(String name,String location,int noOfGates,int noOfGrounds) {
		super(name,location,noOfGates,noOfGrounds);
		System.out.println("all args of playground");
	}
	public PlayGround() {
		this("vivek","bangalore",2,10);
		System.out.println("no args of playground");
	}

}
