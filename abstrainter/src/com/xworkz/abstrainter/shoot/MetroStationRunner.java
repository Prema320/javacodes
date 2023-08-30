package com.xworkz.abstrainter.shoot;

public class MetroStationRunner {

	public static void main(String[] args) {
		Metro metro=new MetroCard();
		MetroStation metroStation=new MetroStation();
		metroStation.setMetro(metro);
		metroStation.stationary();
				
				
	}

}
