package com.sun.moon.app.star;

public class Pub {
	public String pubName;
	public String ownerName;
	public String managerName;
	public int cost;
	public boolean beautiful;
	
	public void dance() {
		System.out.println("invoking dance in pub");
		
		
	}
public void dance(String pubName) {
	System.out.println("invoking string in pub");
	 
		
	}

public void dance(String pubName,String ownerName) {
	System.out.println("invoking string,string in pub");
	 
	
}

public void dance(String pubName,String ownerName,String managerName) {
	System.out.println("invoking string,string,string in pub");
	 
	
}

public void dance(String pubName,String ownerName,String managerName,int cost) {
	System.out.println("invoking string,string,string,int in pub");
	 
	
}

public void dance(String pubName,String ownerName,String managerName,int cost,boolean beautiful) {
	System.out.println("invoking string,string,string,int,boolean in pub");
	 
}


}
