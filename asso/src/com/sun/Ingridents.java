package com.sun;

public class Ingridents {
	public String name;
	public float quantity;
	public int cost;

	public Ingridents(String name,float quantity,int cost) {
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;

	}

	public void printInfo() {
		System.out.println("name is:" + name);
		System.out.println("quantity is: " + quantity);
		System.out.println("cost is:" + cost);

	}

}
