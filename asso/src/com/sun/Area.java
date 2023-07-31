package com.sun;

public class Area {
	public String areaName;
	public Corporator corporator;
	public Area(String areaName,Corporator corporator) {
		this.areaName=areaName;
		this.corporator=corporator;
		
	}
	public void printInfo() {
		System.out.println("areaName :"+areaName);
		System.out.println("coporator:"+corporator);
		
	}

}
