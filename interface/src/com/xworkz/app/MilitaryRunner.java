package com.xworkz.app;

public class MilitaryRunner {

	public static void main(String[] args) {
		Military military=new StrongMilitary();
		military.defence(3);
		military.protect("usa");
		military.stability("dental");
		System.out.println("has it"+military.defence(8));

	}

}
