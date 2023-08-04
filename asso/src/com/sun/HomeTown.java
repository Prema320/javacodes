package com.sun;

public class HomeTown {
	public String homeTownName;
	public double pincode;
	public Area[] area;
	public HomeTown(String homeTownName,double pincode,Area[] area) {
		this.homeTownName=homeTownName;
		this.pincode=pincode;
		this.area=area;
	}
	public void printInfo() {
		System.out.println("homeTownName:"+homeTownName);
		System.out.println("pincode:"+pincode);
		for(int i=0;i<this.area.length;i++) {
			Area ref=this.area[i];
			ref.printInfo();
			
		}
		

		
	}

}
