package com.xworkz.app;

public class ColorfullMetro implements Metro{

	@Override
	public int start(int ticketPrice) {
		System.out.println("invoking start in colorfullmetro");
		return 3;
		
	}

	@Override
	public String stop(String metroName) {
		System.out.println("invoking stop in colorfullmetro ");
		return "nammametro";
	}

	@Override
	public int move( float speed) {
		System.out.println("invoking move in colorfullmetro ");
		return 8;
	}

	
	

}
