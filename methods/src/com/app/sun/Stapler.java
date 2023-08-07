package com.app.sun;

public class Stapler {
	public int price;
	public String material;
	public void stapple() {
		System.out.println("invoking no args stapple");
		stapple(50);
		stapple("steel");
		stapple(30,"plastic");
	}
	public void stapple(int price) {
		System.out.println("invoking int args stapple");
		System.out.println("price"+price);
	}
	public void stapple(String material) {
		System.out.println("invoking string args stapple");
		System.out.println("material"+material);
	}
	public void stapple(int price,String material) {
		System.out.println("invoking string,price args stapple");
		System.out.println("price"+price);
		System.out.println("material"+material);
	}

}
