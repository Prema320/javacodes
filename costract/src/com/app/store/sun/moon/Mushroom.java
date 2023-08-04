package com.app.store.sun.moon;

public class Mushroom {
     public String location;
     public int price;
     public boolean tasty;
     public float weight;
     
     
     public Mushroom(String location,int price,boolean tasty,float weight) {
 System.out.println("all arguments constractor");
    	 this.location=location;
    	 this.price=price;
    	 this.tasty=tasty;
    	 this.weight=weight;
    	 
     }
}
