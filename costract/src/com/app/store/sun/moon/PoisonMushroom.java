package com.app.store.sun.moon;

public class PoisonMushroom extends Mushroom{
	 
	public PoisonMushroom(String location,int price,boolean tasty,float weight) {
		super(location,price,tasty,weight);
		System.out.println("all args for poisonmushroom");
			}

	public PoisonMushroom() {
		this("mysore",100,true,30.0f);
		System.out.println("no args of poisonmushroom");
		
	}
}
