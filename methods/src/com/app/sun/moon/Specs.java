package com.app.sun.moon;

public class Specs {
	public String type;
	public int price;
	
	public void see() {
		System.out.println("invoking no args method");
		see("concave");
		see(1100);
		see("convex",500);
	}
	public void see(String type) {
		System.out.println("invoking string args method");
		System.out.println("type"+type);
	}
	public void see(int price) {
		System.out.println("invoking price args method");
		System.out.println("price"+price);
	}
	public void see(String type,int price) {
		System.out.println("invoking string,price args method");
		System.out.println("type"+type);
		System.out.println("price"+price);
	}


}
