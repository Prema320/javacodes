package com.sun;

public class Floor {
	public String floorName;
	public int floorNo;
	
	public Floor(String floorName,int floorNo) {
		this.floorName=floorName;
		this.floorNo=floorNo;
	}
	public void printInfo() {
		System.out.println("floorname is:"+this.floorName);
		System.out.println("floorNo is:"+this.floorNo);
		
	}
	

}
