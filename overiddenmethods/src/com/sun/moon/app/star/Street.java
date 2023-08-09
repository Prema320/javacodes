package com.sun.moon.app.star;

public class Street {
	public String streetName;
	public String foodName;
	public String itemName  ;
	public int noOfRoads;
	public boolean clean;
	
	public void eat() {
		System.out.println("invoking eat in street");
		
	}
    public void eat(String streetName) {
    	System.out.println("invoking string in street");
   	 
		
	}
    public void eat(String streetName,String foodName) {
    	System.out.println("invoking string,string in street");
   	 
}
    public void eat(String streetName,String foodName,String itemName) {
    	System.out.println("invoking string,string,string in street");
   	 
	
}
    public void eat(String streetName,String foodName,String itemName,int noOfRoads) {
    	System.out.println("invoking string,string,string,int in street");
   	 
	
}
    public void eat(String streetName,String foodName,String itemName,int noOfRoads,boolean clean) {
    	System.out.println("invoking string,string,string,int,boolean in street");
   	 
}
	
}
