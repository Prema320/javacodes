package com.xworkz.abstrainter.shoot;

public class BuildingRunner {

	public static void main(String[] args) {
		Room room=new Bedroom();
		Building building=new Building();
		building.setRoom(room);
		building.shelter();
	}

}
