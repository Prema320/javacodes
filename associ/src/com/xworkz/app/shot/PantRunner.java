package com.xworkz.app.shot;

public class PantRunner {

	public static void main(String[] args) {
		Pant pant=new Pant("black");
		Zip zip=new Zip();
		pant.setZip(zip);
		pant.wearing();
		System.out.println(pant.color);

		
	}

}
