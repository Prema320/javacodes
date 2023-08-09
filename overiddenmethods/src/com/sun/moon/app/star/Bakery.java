package com.sun.moon.app.star;

public class Bakery {
	public String owner;
	public String shopName;
	public String cakeName;
	public int price;
	public float weight;
	
	public void bake() {
		System.out.println("invoking bake in bakery");
	}

	public void bake(String owner) {
		System.out.println("invoking string in bakery");
	}

	public void bake(String owner,String shopName) {
		System.out.println("invoking string,string in bakery");
	}

	public void bake(String owner,String shopName,String cakeName) {
		System.out.println("invoking string,string,string in bakery");
	}

	public void bake(String owner,String shopName,String cakeName, int price) {
		System.out.println("invoking string,string,string,int in bakery");
	}

	public void bake(String owner,String shopName,String cakeName,int price,float weight) {
		System.out.println("invoking string,string,string,int,float in bakery");
	}


}
