package com.sun;

public class Toothpaste {
	public String pasteName;
	public String brand;
	public Company company;
	public Ingridents[] ingridents;
	public Toothpaste(String pasteName,String brand,Company company,Ingridents[] ingridents) {
		this.pasteName=pasteName;
		this.brand=brand;
		this.company=company;
		this.ingridents=ingridents;
		
	}
	public void printInfo() {
		System.out.println("pasteName is:"+this.pasteName);
		System.out.println("brand is:"+brand);
		System.out.println("\n");
	    company.printInfo();
		for(int i=0;i<this.ingridents.length;i++)
		{
			Ingridents ref=ingridents[i];
	
			ref.printInfo();
			
		}
	
		
	}
	

}
