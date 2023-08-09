package com.sun.moon.app.star;

public class Temple {
	public String templeName;
	public String founderName;
	public String material  ;
	public int noOfsteps;
	public boolean beautiful;
	
	public void peace() {
		System.out.println("invoking peace in temple");
	}
	
public void peace( String templeName) {
	System.out.println("invoking string in temple");
		
	}
public void peace( String templeName,String founderName) {
	System.out.println("invoking string,string in temple");
	
}
public void peace( String templeName,String founderName,String material ) {
	System.out.println("invoking string,string,string in temple");
	
}
public void peace( String templeName,String founderName,String material, int noOfsteps ) {
	System.out.println("invoking string,string,string,int in temple");
	
}
public void peace( String templeName,String founderName,String material, int noOfsteps,boolean beautiful ) {
	System.out.println("invoking string,string,string,int,boolean in temple");
	
}

}
