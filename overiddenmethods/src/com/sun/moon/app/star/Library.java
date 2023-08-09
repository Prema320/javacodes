package com.sun.moon.app.star;

public class Library {
	public String ownerName;
	public String libraryName;
	public String color  ;
	public int noOfBooks;
	public boolean useful;
	
	public void study() {
	System.out.println("invoking study in library");
	}
	
	public void study(String ownerName) {
		System.out.println("invoking string in library");
		
		
	}
	
	public void study(String ownerName,String libraryName) {
		System.out.println("invoking string,string in library");
		
	}
	
	public void study(String ownerName,String libraryName,String color) {
		System.out.println("invoking string,string,string in library");
		
	}
	
	public void study(String ownerName,String libraryName,String color,int noOfBooks) {
		System.out.println("invoking string,string,string,int in library");
		
	}
	
	public void study(String ownerName,String libraryName,String color,int noOfBooks,boolean useful) {
		System.out.println("invoking string,string,string,int,boolean in library");
		
	}
	

}
