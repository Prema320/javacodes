package com.xworkz.app;

public class GoldenTemple implements Temple {

	@Override
	public int pooja(int entryFee) {
		System.out.println("invoking pooja in goldentemple");
		return 2;
	}

	@Override
	public String seeGod(String madeUpOf) {
		System.out.println("invoking seegod in goldentemple");
		return "silver";
	}

	@Override
	public int peace(int noOfGods) {
		System.out.println("invoking peace in goldentemple");
		return 4;
	}

}
