package com.sun.moon.app.star;

public class Market {
	public String marketName;
	public String shopName;
	public String ownerName  ;
	public int noofShops;
	public boolean near;
	
	 public void buy() {
		 System.out.println("invoking buy in market");
	 }
    public void buy( String marketName) {
    	System.out.println("invoking string in market");
    	
		 
	 }
     public void buy( String marketName,String shopName) {
    	 System.out.println("invoking string,string in market");
	 
}
     public void buy( String marketName,String shopName,String ownerName) {
    	 System.out.println("invoking string,string,string in market");
	 
}
     public void buy( String marketName,String shopName,String ownerName,int noofShops) {
    	 System.out.println("invoking string,string,string,int in market");
	 
}
     public void buy( String marketName,String shopName,String ownerName,int noofShops,boolean near) {
    	 System.out.println("invoking string,string,string,int,boolean in market");
	 
}


}
