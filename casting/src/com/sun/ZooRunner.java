package com.sun;

public class ZooRunner {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		StateZoo statezoo=new StateZoo();
		NationalZoo nationalzoo=new NationalZoo();
		
		ZooUtil util=new ZooUtil();
		System.out.println("invoking main zoo");
		System.out.println(zoo.animalName);
		util.run(zoo);
		
		ZooUtil util1=new ZooUtil();
		System.out.println("invoking main nationalzoo");
		System.out.println(nationalzoo.location);
		util1.run(nationalzoo);
		
		ZooUtil util2=new ZooUtil();
		System.out.println("invoking main zoo");
		System.out.println(statezoo.name);
		util2.run(statezoo);
		
		
			}

}
