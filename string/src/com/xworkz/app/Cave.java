package com.xworkz.app;

public class Cave {
	
	private String caveHouseColor;
	private String caveHouseLocation;
	private String madeUpOf;
	private boolean shelter;
	private int types;
	private float temperature;
	private String anotherName;
	private String firstCave;
	private boolean openingInEarth;
	private boolean usefulToAnimals;
	
	
	
	public Cave() {
		super();
	}



	public Cave(String caveHouseColor, String caveHouseLocation, String madeUpOf, boolean shelter, int types,
			float temperature, String anotherName, String firstCave, boolean openingInEarth, boolean usefulToAnimals) {
		super();
		this.caveHouseColor = caveHouseColor;
		this.caveHouseLocation = caveHouseLocation;
		this.madeUpOf = madeUpOf;
		this.shelter = shelter;
		this.types = types;
		this.temperature = temperature;
		this.anotherName = anotherName;
		this.firstCave = firstCave;
		this.openingInEarth = openingInEarth;
		this.usefulToAnimals = usefulToAnimals;
	}



	@Override
	public String toString() {
		return "caveHouseColor=" + caveHouseColor + ", caveHouseLocation=" + caveHouseLocation + ", madeUpOf="
				+ madeUpOf + ", shelter=" + shelter + ", types=" + types + ", temperature=" + temperature
				+ ", anotherName=" + anotherName + ", firstCave=" + firstCave + ", openingInEarth=" + openingInEarth
				+ ", usefulToAnimals=" + usefulToAnimals ;
	}
	
	
	

}
