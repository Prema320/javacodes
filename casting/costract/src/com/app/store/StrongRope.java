package com.app.store;

public class StrongRope extends Rope {

	 public StrongRope(String name,String material,int price,String color) {
		 
		super(name,material,price,color);
		System.out.println("all args const of strongrouter");
		
	 }
	   public StrongRope() {
		   this("HMPE","nylon",300,"white");
		   System.out.println("no args const of strongrouter ");
	   }

}
