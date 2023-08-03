package com.sun;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkchocolate=new DarkChocolate();
		CaramelChocolate caramelchocolate=new CaramelChocolate();
		
		ChocolateUtil util=new ChocolateUtil();
		System.out.println("invoking chocolate");
		System.out.println(chocolate.color);
		util.run(chocolate);
		
		
		ChocolateUtil util1=new ChocolateUtil();
		System.out.println("invoking darkchocolate");
		System.out.println(darkchocolate.color);
		System.out.println(darkchocolate.price);
		util1.run(darkchocolate);
		
		ChocolateUtil util2=new ChocolateUtil();
		System.out.println("invoking caramelchocolate");
		System.out.println(caramelchocolate.color);
		System.out.println(caramelchocolate.brand);
		util2.run(caramelchocolate);


	}
	

}
