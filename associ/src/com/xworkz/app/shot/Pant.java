package com.xworkz.app.shot;

public class Pant {

	public String color;
	public Zip zip;

	public Pant(String color) {
		this.color = color;
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void wearing() {
		System.out.println("pant can be wear");
		this.zip.make();
	}
}
