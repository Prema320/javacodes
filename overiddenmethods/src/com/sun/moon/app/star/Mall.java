package com.sun.moon.app.star;

public class Mall {
	public String ownerName;
	public String mallName;
	public String material ;
	public int lifts;
	public boolean beautiful;
	
	public void shop() {
		System.out.println("invoking shop in mall");
	}
	
	public void shop(String ownerName) {
		System.out.println("invoking string in mall");
	}
	
	public void shop(String ownerName,String mallName) {
		System.out.println("invoking string,string in mall");
	}
	
	public void shop(String ownerName,String mallName,String material) {
		System.out.println("invoking string,string,string in mall");
	}
	
	public void shop(String ownerName,String mallName,String material,int lifts) {
		System.out.println("invoking string,string,string,int in mall");
	}
	
	public void shop(String ownerName,String mallName,String material,int lifts,boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in mall");
	}

}
