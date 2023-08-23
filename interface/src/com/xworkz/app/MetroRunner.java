package com.xworkz.app;

public class MetroRunner {

	public static void main(String[] args) {
		
		Metro metro=new ColorfullMetro();
		metro.start(30);
		metro.stop("nammametro");
		metro.move(3.5f);
		
	}

}
