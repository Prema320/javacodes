package com.sun.moon;

public class Furniture extends Wood{
	public int price=2000;
	public void uses() {
		System.out.println("furniture can be used for sit");
		System.out.println("price:"+price);
	}

}
