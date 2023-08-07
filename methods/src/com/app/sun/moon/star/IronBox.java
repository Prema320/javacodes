package com.app.sun.moon.star;

public class IronBox {
	public String material;
	public int price;
	
	public void heat() {
		System.out.println("no agrs method");
		heat("iron");
		heat(500);
	}
	public void heat(String material) {
		System.out.println("invoking string args method");
		System.out.println(material);
	}
	public void heat(int price) {
		System.out.println("invoking price args method");
		System.out.println(price);
		heat("steel",400);
	}
	public void heat(String material,int price) {
		System.out.println("invoking string,price args method");
		System.out.println(material);
		System.out.println(price);
		
	}
}
