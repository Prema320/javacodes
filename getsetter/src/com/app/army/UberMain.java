package com.app.army;

public class UberMain {

	public static void main(String[] args) {
		Uber uber=new Uber();
		
		
		uber.setOwnerName("sagar");
	    System.out.println(uber.getOwnerName());
	    uber.setLogoColor("Blue");
	    System.out.println(uber.getLogoColor());
	    uber.setUseful(true);
	    System.out.println(uber.isUseful());
	    uber.setCeo("roja");
	    System.out.println(uber.getCeo());
	    uber.setAge(55);
	    System.out.println(uber.getAge());
	    uber.setExp(9);
	    System.out.println(uber.getExp());
	    uber.setWindow("mac");
	    System.out.println(uber.getWindow());
	    uber.setWebsite("facebook.com");
	    System.out.println(uber.getWebsite());
	    uber.setAllowImages(true);
	    System.out.println(uber.isAllowImages());
	    uber.setAllowVideos(true);
	    System.out.println(uber.isAllowVideos());
	    uber.setLanguage("clang");
	    System.out.println(uber.getLanguage());
	    uber.setHeadquater("India");
	    System.out.println(uber.getHeadquater());
	    uber.setSize(35.8f);
	    System.out.println(uber.getSize());
	    uber.setType("personal");
	    System.out.println(uber.getType());
	    System.out.println("\n");
	    

			}

}
