package com.xworkz.app.shot;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt=new Shirt("richlook");
		Button button=new Button();
		shirt.setButton(button);
		shirt.wear();
		System.out.println(shirt.brand);
		
	}

}
