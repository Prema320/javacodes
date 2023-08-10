package com.app.army;

public class RedbusMain {

	public static void main(String[] args) {
		Redbus redbus=new Redbus();
		
		redbus.setOwnerName("sagar");
	    System.out.println(redbus.getOwnerName());
	    redbus.setLogoColor("Blue");
	    System.out.println(redbus.getLogoColor());
	    redbus.setUseful(true);
	    System.out.println(redbus.isUseful());
	    redbus.setCeo("roja");
	    System.out.println(redbus.getCeo());
	    redbus.setAge(55);
	    System.out.println(redbus.getAge());
	    redbus.setExp(9);
	    System.out.println(redbus.getExp());
	    redbus.setWindow("mac");
	    System.out.println(redbus.getWindow());
	    redbus.setWebsite("facebook.com");
	    System.out.println(redbus.getWebsite());
	    redbus.setAllowImages(true);
	    System.out.println(redbus.isAllowImages());
	    redbus.setAllowVideos(true);
	    System.out.println(redbus.isAllowVideos());
	    redbus.setLanguage("clang");
	    System.out.println(redbus.getLanguage());
	    redbus.setHeadquater("India");
	    System.out.println(redbus.getHeadquater());
	    redbus.setSize(35.8f);
	    System.out.println(redbus.getSize());
	    redbus.setType("personal");
	    System.out.println(redbus.getType());
	    System.out.println("\n");
	    
	}

}
