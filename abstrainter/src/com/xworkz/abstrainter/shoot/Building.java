package com.xworkz.abstrainter.shoot;

public class Building {
	Room room;
	
	public void shelter() {
		System.out.println("invoke shelter in building");
		this.room.protect();
	}

	
	public void setRoom(Room room) {
		this.room=room;
		
	}
}
