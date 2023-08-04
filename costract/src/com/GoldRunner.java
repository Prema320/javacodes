package com;

public class GoldRunner {

	public static void main(String[] args) {
		
		  PureGold gold=new PureGold();
		  System.out.println(gold.type);
		  System.out.println(gold.cost);
		  System.out.println(gold.weight);
		  System.out.println(gold.shopName);
		  
		  
		  PureGold gold1=new PureGold("80gold",1000,2.0f,"raghushop");
		  System.out.println(gold1.type);
		  System.out.println(gold1.cost);
		  System.out.println(gold1.weight);
		  System.out.println(gold1.shopName);
	}

}
