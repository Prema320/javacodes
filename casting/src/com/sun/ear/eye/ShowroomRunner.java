package com.sun.ear.eye;

public class ShowroomRunner {

	public static void main(String[] args) {
		Showroom showroom=new Showroom();

		WatchShowroom watch=new WatchShowroom();

		MobileShowroom mobile=new MobileShowroom();

		ShowroomUtil util=new ShowroomUtil();
		System.out.println("Invoking run with showroom ");
		System.out.println(showroom.name);
		util.run(showroom);
		

		ShowroomUtil util1=new ShowroomUtil();
		System.out.println("Invoking run with watchshowroom ");
		System.out.println(watch.name);
		System.out.println(watch.cost);
		util1.run(watch);
		
		ShowroomUtil util2=new ShowroomUtil();
		System.out.println("Invoking run with mobileshowroom ");
		System.out.println(mobile.name);
		System.out.println(mobile.brand);
		util2.run(mobile);
	}

}
