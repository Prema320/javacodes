package com.xworkz.app;

public class GoodEnginner implements Enginner {

	@Override
	public String study(String name) {
		System.out.println("invoking study in goodenginner");
		return null;
	}

	@Override
	public int attendance(int noOfStudent) {
		System.out.println("invoking attendance in goodenginner");
		return 2;
	}

	@Override
	public float avgMarks(float fee) {
		System.out.println("invoking avgmarks in goodenginner");
		return 0;
	}

}
