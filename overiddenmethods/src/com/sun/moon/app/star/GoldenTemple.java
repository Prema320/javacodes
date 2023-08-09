package com.sun.moon.app.star;

public class GoldenTemple  extends Temple{

	@Override
	public void peace() {
		System.out.println("invoking peace in goldentemple");
		super.peace();
	}

	@Override
	public void peace(String templeName) {
		System.out.println("invoking string in goldentemple");
		super.peace(templeName);
	}

	@Override
	public void peace(String templeName, String founderName) {
		System.out.println("invoking string,string in goldentemple");
		super.peace(templeName, founderName);
	}

	@Override
	public void peace(String templeName, String founderName, String material) {
		System.out.println("invoking string,string,string in goldentemple");
		super.peace(templeName, founderName, material);
	}

	@Override
	public void peace(String templeName, String founderName, String material, int noOfsteps) {
		System.out.println("invoking string,string,string,int in goldentemple");
		
		super.peace(templeName, founderName, material, noOfsteps);
	}

	@Override
	public void peace(String templeName, String founderName, String material, int noOfsteps, boolean beautiful) {
		System.out.println("invoking string,string,string,int,boolean in temple");
		
		super.peace(templeName, founderName, material, noOfsteps, beautiful);
	}

}
