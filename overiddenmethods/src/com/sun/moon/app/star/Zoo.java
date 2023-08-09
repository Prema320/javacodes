package com.sun.moon.app.star;

public class Zoo {
	public String zooName;
	public String animalName;
	public String color  ;
	public int noOflegs;
	public boolean beautiful;
	
	public void saw() {
		System.out.println("invoking saw in zoo");
		
	}
    public void saw(String zooName) {
    	System.out.println("invoking string in zoo");
      	 
		
	}
    public void saw(String zooName,String animalName) {
    	System.out.println("invoking string,string in zoo");
      	 
	
}
    public void saw(String zooName,String animalName,String color) {
    	System.out.println("invoking string,string,string in zoo");
      	 
	
}
    public void saw(String zooName,String animalName,String color,int noOflegs) {
    	System.out.println("invoking string,string,string,int in zoo");
      	 
	
}
    public void saw(String zooName,String animalName,String color,int noOflegs, boolean beautiful) {
    	System.out.println("invoking string,string,string,int,boolean in zoo");
      	 
}

}
