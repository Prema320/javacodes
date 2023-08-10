package com.app.army;

public class PhonePeMain {

	public static void main(String[] args) {
		PhonePe phonePe=new PhonePe();

		phonePe.setOwnerName("sagar");
	    System.out.println(phonePe.getOwnerName());
	    phonePe.setLogoColor("Blue");
	    System.out.println(phonePe.getLogoColor());
	    phonePe.setUseful(true);
	    System.out.println(phonePe.isUseful());
	    phonePe.setCeo("roja");
	    System.out.println(phonePe.getCeo());
	    phonePe.setAge(55);
	    System.out.println(phonePe.getAge());
	    phonePe.setExp(9);
	    System.out.println(phonePe.getExp());
	    phonePe.setWindow("mac");
	    System.out.println(phonePe.getWindow());
	    phonePe.setWebsite("phonepe.com");
	    System.out.println(phonePe.getWebsite());
	    phonePe.setAllowImages(true);
	    System.out.println(phonePe.isAllowImages());
	    phonePe.setAllowVideos(true);
	    System.out.println(phonePe.isAllowVideos());
	    phonePe.setLanguage("clang");
	    System.out.println(phonePe.getLanguage());
	    phonePe.setHeadquater("India");
	    System.out.println(phonePe.getHeadquater());
	    phonePe.setSize(35.8f);
	    System.out.println(phonePe.getSize());
	    phonePe.setType("public");
	    System.out.println(phonePe.getType());
	    System.out.println("\n");
	    
	}

}
