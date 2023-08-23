package com.xworkz.app;

public class GoodPG implements PG {

	@Override
	public float enjoy(float rent) {
		System.out.println("invoking enjoy in goodpg");
		return 5.4f;
	}

	@Override
	public String study(String bedColor) {
		System.out.println("invoking study in goodpg");
		return "pink";
	}

	@Override
	public int safe(boolean foodIsTasty) {
		System.out.println("invoking safe in goodpg");
		return 3;
	}

}
