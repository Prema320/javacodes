package com.xworkz.app.shot;

public class Shirt {

	public String brand;
	public Button button;

	public Shirt(String brand) {
		this.brand = brand;

	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void wear() {
		System.out.println("shirt can be wear");
		this.button.fit();
	}

}
