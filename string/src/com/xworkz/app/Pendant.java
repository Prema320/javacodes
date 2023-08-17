package com.xworkz.app;

public class Pendant {
	private String material;
	private int cost;
	private String color;
	private float weight;
	private boolean beautiful;
	private boolean usedForDecorativePurpose;
	private int types;
	private String shape;
	private float length;
	private double thickness;
	private int noOfPearls;
	private String anotherSpelled;
	
	
	
	
	public Pendant() {
		super();
	}




	public Pendant(String material, int cost, String color, float weight, boolean beautiful,
			boolean usedForDecorativePurpose, int types, String shape, float length, double thickness, int noOfpearles,
			String anotherSpelled) {
		super();
		this.material = material;
		this.cost = cost;
		this.color = color;
		this.weight = weight;
		this.beautiful = beautiful;
		this.usedForDecorativePurpose = usedForDecorativePurpose;
		this.types = types;
		this.shape = shape;
		this.length = length;
		this.thickness = thickness;
		this.noOfPearls = noOfPearls;
		this.anotherSpelled = anotherSpelled;
	}




	@Override
	public String toString() {
		return "material=" + material + ", cost=" + cost + ", color=" + color + ", weight=" + weight
				+ ", beautiful=" + beautiful + ", usedForDecorativePurpose=" + usedForDecorativePurpose + ", types="
				+ types + ", shape=" + shape + ", length=" + length + ", thickness=" + thickness + ", noOfpearles="
				+ noOfPearls + ", anotherSpelled=" + anotherSpelled ;
	}
	
	
	

}
