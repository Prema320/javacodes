package com.sun;

public class Player {
	public String name;
	public int exp;
	public Building building;
	public HomeTown town;

	public Player( String name, int exp,Building building, HomeTown town) {
		this.building = building;
		this.name = name;
		this.exp = exp;
		this.town = town;

	}

	public void printInfo() {
		System.out.println("building:" + building);
		System.out.println("name:" + name);
		System.out.println("exp:" + exp);
		System.out.println("town:" + town);

	}
}
