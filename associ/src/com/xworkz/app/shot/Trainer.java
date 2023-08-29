package com.xworkz.app.shot;

public class Trainer {

	public int age;
	Laptop laptop;

	public Trainer(int age) {
		this.age = age;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void working() {
		System.out.println("trainer is working");
		this.laptop.storage();
	}

}
