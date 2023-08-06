package com.app.store.sun;

public class CoffeeRunner {

	public static void main(String[] args) {
		
		StrongCoffee coffee=new StrongCoffee();
		System.out.println(coffee.brand);
		System.out.println(coffee.shopName);
		System.out.println(coffee.price);
		System.out.println(coffee.tasty);
		
		StrongCoffee coffee1=new StrongCoffee("bru","sana",10,false);
		System.out.println(coffee1.brand);
		System.out.println(coffee1.shopName);
		System.out.println(coffee1.price); 
		System.out.println(coffee1.tasty);
	}

}
