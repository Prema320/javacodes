package com.app.store.sun;

public class StrongCoffee extends Coffee {
	
	public StrongCoffee(String brand,String shopName,int price,boolean tasty) {
		super(brand,shopName,price,tasty);
		System.out.println("all args const of strongcoffee");
	}
	public StrongCoffee() {
		this("rubast","prema",15,true);
		System.out.println("on args const of strongcoffee");
		
	}
	

}
