package com.sun;

public class Corporator {
	public String corporatorName;
	public Building[] buildings;
	public Corporator(String corporatorName,Building[] buildings) {
		this.corporatorName=corporatorName;
		this.buildings=buildings;
	}
	public void printInfo() {
	System.out.println("corporatorName is:"+this.corporatorName);
	for(int i=0;i<this.buildings.length;i++) {
		Building ref=this.buildings[i];
		ref.printInfo();
		
	}
	}

}
