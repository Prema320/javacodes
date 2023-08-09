package com.sun.moon.app.star;

public class BakeryMan extends Bakery {
	public void bake() {
		System.out.println("invoking bake in bakeryman");
	
		
	}

	@Override
	public void bake(String owner) {
		System.out.println("invoking string in bakeryman");
	}
		
	

	@Override
	public void bake(String owner, String shopName) {
		System.out.println("invoking string,string in bakeryman");
		
	}

	@Override
	public void bake(String owner, String shopName, String cakeName) {
		System.out.println("invoking string,string,string in bakeryman");
		
	}

	@Override
	public void bake(String owner, String shopName, String cakeName, int price) {
		System.out.println("invoking string,string,string,int in bakeryman");
		
	}

	@Override
	public void bake(String owner, String shopName, String cakeName, int price, float weight) {
		System.out.println("invoking string,string,string,int,float in bakeryman");
		
	}
}
