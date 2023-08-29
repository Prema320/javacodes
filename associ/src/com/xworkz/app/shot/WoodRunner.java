package com.xworkz.app.shot;

public class WoodRunner {

	public static void main(String[] args) {
		
		Wood wood=new Wood(32.0f);
		Paper paper=new Paper();
				
		wood.setPaper(paper);
		wood.cut();
		System.out.println(wood.weight);
		

	}

}
