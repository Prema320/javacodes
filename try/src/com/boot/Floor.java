package com.boot;

public class Floor {
	public String floorName;
	public int floorNo;
	
	public Floor(String floorName,int floorNo) {
		this.floorName=floorName;
		this.floorNo=floorNo;
		
	}
	public void print() {
		System.out.println("floorName:"+this.floorName);
		System.out.println("floorNo:"+this.floorNo);

		
		
	}

}
