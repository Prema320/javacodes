package com.app.army;

public class NetflixMain {

	public static void main(String[] args) {
		Netflix netflix=new Netflix();
		
		netflix.setOwnerName("shivani");
	    System.out.println(netflix.getOwnerName());
	    netflix.setLogoColor("white");
	    System.out.println(netflix.getLogoColor());
	    netflix.setUseful(true);
	    System.out.println(netflix.isUseful());
	    netflix.setCeo("Anu");
	    System.out.println(netflix.getCeo());
	    netflix.setAge(55);
	    System.out.println(netflix.getAge());
	    netflix.setExp(9);
	    System.out.println(netflix.getExp());
	    netflix.setWindow("mac");
	    System.out.println(netflix.getWindow());
	    netflix.setWebsite("netflix.com");
	    System.out.println(netflix.getWebsite());
	    netflix.setAllowImages(true);
	    System.out.println(netflix.isAllowImages());
	    netflix.setAllowVideos(true);
	    System.out.println(netflix.isAllowVideos());
	    netflix.setLanguage("c+++lang");
	    System.out.println(netflix.getLanguage());
	    netflix.setHeadquater("India");
	    System.out.println(netflix.getHeadquater());
	    netflix.setSize(35.8f);
	    System.out.println(netflix.getSize());
	    netflix.setType("public");
	    System.out.println(netflix.getType());
	    System.out.println("\n");
	    
	}

		
	}


