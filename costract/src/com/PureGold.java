package com;

public class PureGold  extends Gold{
   
	   public PureGold(String type,int cost,float weight,String shopName) {
		   super(type,cost,weight,shopName);
		   System.out.println("all args of puregold");
		   
	   }
	   
	   public PureGold() {
		   this("24car",2000,1.0f,"ravigoldshop");
		   System.out.println("no args of puregold");
		   
	   }
	   
	   
}
