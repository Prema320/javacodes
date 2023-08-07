package com.app;

public class Plier {
	public int price;
	public float types;
	
	public void grip() {
		System.out.println("invoking no args grip");
		grip(100);
		grip(25);
		grip(200,24);
	}
	public void grip(int price) {
		System.out.println("invoking int args grip");
		System.out.println("price"+price);
	}
	public void grip(float types) {
		System.out.println("invoking float args grip");
		System.out.println("types"+types);
	}
	public void grip(int price,float types) {
		System.out.println("invoking int,float args grip");
		System.out.println("price"+price);
		System.out.println("types"+types);
	}

}
