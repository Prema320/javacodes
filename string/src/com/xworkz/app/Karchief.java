package com.xworkz.app;

public class Karchief {
	private int price;
	private String color;
	private String shape;
	private String clothType;
	private String anotherName;
	private String inventor;
	private boolean protectHead;
	
	
	
	public Karchief() {
		super();
	}



	public Karchief(int price, String color, String shape, String clothType, String anotherName, String inventor,
			boolean protectHead) {
		super();
		this.price = price;
		this.color = color;
		this.shape = shape;
		this.clothType = clothType;
		this.anotherName = anotherName;
		this.inventor = inventor;
		this.protectHead = protectHead;
	}



	@Override
	public String toString() {
		return "price=" + price +" , color=" + color + ", shape=" + shape + ", clothType=" + clothType
				+ ", anotherName=" + anotherName + ", inventor=" + inventor + ", protectHead=" + protectHead  ;
	}
	
	
	
	
	

}
