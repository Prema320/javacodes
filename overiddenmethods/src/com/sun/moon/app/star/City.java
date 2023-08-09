package com.sun.moon.app.star;

public class City {
	public String cityName;
	public String oldName;
	public String  famousAreaName  ;
	public int noOfArea;
	public boolean beautiful;
	
	public void beauty() {
		System.out.println("invoking beauty in city");
		
	}
	
   public void beauty(String cityName) {
	System.out.println("invoking string in city");
 	 
		
	}

   public void beauty(String cityName,String oldName) {
	   System.out.println("invoking string,string in city");
	 	 
		
	
}

   public void beauty(String cityName,String oldName,String  famousAreaName) {
	   System.out.println("invoking string,string,string in city");
	 	 
		
	
}

   public void beauty(String cityName,String oldName,String  famousAreaName,int noOfArea) {
	   System.out.println("invoking string,string,string,int in city");
	 	 
		
	
}

    public void beauty(String cityName,String oldName,String  famousAreaName,int noOfArea,boolean beautiful) {
    	System.out.println("invoking string,string,string,int,boolean in city");
    	 
		
}


}
