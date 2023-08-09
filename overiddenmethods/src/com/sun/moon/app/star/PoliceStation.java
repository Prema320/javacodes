package com.sun.moon.app.star;

public class PoliceStation {
	public String stationName;
	public String oldName;
	public String  policeName  ;
	public int age;
	public boolean sensior;
	
   public void job() {
	   System.out.println("invoking job in policestation");
		
		
	}
    public void job(String stationName) {
    	System.out.println("invoking string in policestation");
   	 
		
	}

    public void job(String stationName,String oldName) {
    	System.out.println("invoking string,string in policestation");
   	 
	
}

    public void job(String stationName,String oldName,String policeName) {
    	System.out.println("invoking string,string,string in policestation");
   	 
	
}

    public void job(String stationName,String oldName,String policeName,int age) {
    	System.out.println("invoking string,string,string,int in policestation");
   	 
	
}

    public void job(String stationName,String oldName,String policeName,int age,boolean sensior) {
    	System.out.println("invoking string,string,string,int,boolean in policestation");
   	 
	
}


}



