package com.sun.moon.app.star;

public class SmallLibrary extends Library {

	@Override
	public void study() {
		System.out.println("invoking study in smalllibrary");
		super.study();
	}

	@Override
	public void study(String ownerName) {
		System.out.println("invoking string in smalllibrary");
		super.study(ownerName);
	}

	@Override
	public void study(String ownerName, String libraryName) {
		System.out.println("invoking string,string in smalllibrary");
		super.study(ownerName, libraryName);
	}

	@Override
	public void study(String ownerName, String libraryName, String color) {
		System.out.println("invoking string,string,string in smalllibrary");
		super.study(ownerName, libraryName, color);
	}

	@Override
	public void study(String ownerName, String libraryName, String color, int noOfBooks) {
		System.out.println("invoking string,string,string,int in smalllibrary");
		super.study(ownerName, libraryName, color, noOfBooks);
	}

	@Override
	public void study(String ownerName, String libraryName, String color, int noOfBooks, boolean useful) {
		System.out.println("invoking string,string,string,int,boolean in smalllibrary");
		super.study(ownerName, libraryName, color, noOfBooks, useful);
	}
	

}
