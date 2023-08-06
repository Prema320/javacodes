package com.app.store.sun;

public class RouterRunner {

	public static void main(String[] args) {
		WiredRouter wired=new WiredRouter();
		System.out.println(wired.cost);
		System.out.println(wired.type);
		System.out.println(wired.size);
		System.out.println(wired.color);
		
		WiredRouter wired1=new WiredRouter(2000,'m',"white",3);
		System.out.println(wired1.cost);
		System.out.println(wired1.type);
		System.out.println(wired1.size);
		System.out.println(wired1.color);


	}

}
