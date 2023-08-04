package com.app.store.sun;

public class Coffee {
	public String brand;
	public String shopName;
	public int price;
	public boolean tasty;
	
	
	public Coffee(String brand,String shopName,int price,boolean tasty) {
		System.out.println("all arg const of coffee");
		this.brand=brand;
		this.shopName=shopName;
		this.price=price;
		this.tasty=tasty;
		
	}

}
