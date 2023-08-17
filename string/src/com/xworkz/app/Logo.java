package com.xworkz.app;

public class Logo {
	private String brandName;
	private String color;
	private String logoMaker;
	private boolean useful;
	private int noOfPrinciples;
	
	
	
	public Logo() {
		super();
	}



	public Logo(String brandName, String color, String logoMaker, boolean useful, int noOfPrinciples) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.logoMaker = logoMaker;
		this.useful = useful;
		this.noOfPrinciples = noOfPrinciples;
	}
	
	@Override
	public String toString() {
		System.out.println("invoking string in logo");
		return "brandname:"+this.brandName+ "color:"+this.color+"logoMaker:"+this.logoMaker+"useful:"+this.useful+"noOfPrinclples:"+this.noOfPrinciples;
	}
	
	
	

}
