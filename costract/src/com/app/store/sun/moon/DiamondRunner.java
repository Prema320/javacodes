package com.app.store.sun.moon;

public class DiamondRunner {

	public static void main(String[] args) {
		 
		PureDiamond dia=new PureDiamond();
		  System.out.println(dia.type);
		  System.out.println(dia.price);
		  System.out.println(dia.material);
		  System.out.println(dia.ownerName);
		  
		  PureDiamond dia1=new PureDiamond("synthetic",20000,"carbon","raghav");
		  System.out.println(dia1.type);
		  System.out.println(dia1.price);
		  System.out.println(dia1.material);
		  System.out.println(dia1.ownerName);
	}

}
