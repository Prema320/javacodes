package com.app.store.sun;

public class WiredRouter  extends Router{
	
	public WiredRouter(int cost,char size,String color,int type) {
		super(cost,size,color,type);
		System.out.println("all args in wiredrouter"); 
		
	}
     public WiredRouter() {
    	 this(500,'s',"pink",5);
    	 System.out.println("no args in wiredrouter");
     }
	
}
