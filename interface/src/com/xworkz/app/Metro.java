package com.xworkz.app;

public interface Metro {
	
	
	public abstract int start(int ticketPrice);
	public abstract String stop(String metroName);
	public abstract int move(float speed);
	

}
