package com.app.store.sun.moon;

public class PureDiamond  extends Diamond{

    public PureDiamond(String type,double price, String material,String ownerName) {
    	super(type,price,material,ownerName);
    	System.out.println("all args const of purediamond");
    	
    }
    public PureDiamond() {
    	this("emerald",30000,"graphite","sonu");
    	System.out.println("no args const of purediamond");
    }
}
