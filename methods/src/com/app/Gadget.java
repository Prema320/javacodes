package com.app;

public class Gadget {
	public String name;
	public int price;
	
	public void call() {
		System.out.println("invoking no args in call");
		call("smartphone");
		call(10000);
		call("tab",20000);
	}
	public void call(String name) {
		System.out.println("invoking string args in call");
		System.out.println("name"+name);
	}
	public void call(int price) {
		System.out.println("invoking int args in call");
		System.out.println("price"+price);
	}
	public void call(String name,int price) {
		System.out.println("invoking string,int args in call");
		System.out.println("name"+name);
		System.out.println("price"+price);
	}
}
