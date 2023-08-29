package com.xworkz.app.shot;

public class LaptopsRunner {

	public static void main(String[] args) {
		Laptops laptops=new Laptops();
		Processor processor=new Processor();
		laptops.setProcessor(processor);
		laptops.takePicture();
		
	}

}
