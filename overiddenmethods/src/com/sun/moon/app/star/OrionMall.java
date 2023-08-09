package com.sun.moon.app.star;

public class OrionMall  extends Mall{

	@Override
	public void shop() {
		System.out.println("invoking shop in orionmall");
		super.shop();
	}

	@Override
	public void shop(String ownerName) {
		System.out.println("invoking string in orionmall");
		super.shop(ownerName);
	}

	@Override
	public void shop(String ownerName, String mallName) {
		System.out.println("invoking string,string in orionmall");
		super.shop(ownerName, mallName);
	}

	@Override
	public void shop(String ownerName, String mallName, String material) {
		System.out.println("invoking string,string,string in orionmall");
		super.shop(ownerName, mallName, material);
	}

	@Override
	public void shop(String ownerName, String mallName, String material, int lifts) {
		System.out.println("invoking string,string,string,int in orionmall");
		super.shop(ownerName, mallName, material, lifts);
	}

	@Override
	public void shop(String ownerName, String mallName, String material, int lifts, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in orionmall");
		super.shop(ownerName, mallName, material, lifts, beautiful);
	}
	

}
