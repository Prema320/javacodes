package com.sun;

public class Company {
	
	public String companyName;
    public String ceo;
	public String originCountry;
	
public Company(String companyName,String ceo,String originCountry) {
		this.companyName=companyName;
		this.ceo=ceo;
		this.originCountry=originCountry; 
		
	}
public void printInfo() {
	System.out.println("companyName is:"+companyName);
	System.out.println("ceo is :"+ceo);
	System.out.println("origincountry is:"+originCountry);
	
}
	

}
