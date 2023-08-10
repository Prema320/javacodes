package com.app.army;

public class OlaMain {

	public static void main(String[] args) {
		Ola ola=new Ola();
		
		ola.setOwnerName("sagar");
	    System.out.println(ola.getOwnerName());
	    ola.setLogoColor("Blue");
	    System.out.println(ola.getLogoColor());
	    ola.setUseful(true);
	    System.out.println(ola.isUseful());
	    ola.setCeo("roja");
	    System.out.println(ola.getCeo());
	    ola.setAge(55);
	    System.out.println(ola.getAge());
	    ola.setExp(9);
	    System.out.println(ola.getExp());
	    ola.setWindow("mac");
	    System.out.println(ola.getWindow());
	    ola.setWebsite("facebook.com");
	    System.out.println(ola.getWebsite());
	    ola.setAllowImages(true);
	    System.out.println(ola.isAllowImages());
	    ola.setAllowVideos(true);
	    System.out.println(ola.isAllowVideos());
	    ola.setLanguage("clang");
	    System.out.println(ola.getLanguage());
	    ola.setHeadquater("India");
	    System.out.println(ola.getHeadquater());
	    ola.setSize(35.8f);
	    System.out.println(ola.getSize());
	    ola.setType("personal");
	    System.out.println(ola.getType());
	    System.out.println("\n");
	    
	}

}
