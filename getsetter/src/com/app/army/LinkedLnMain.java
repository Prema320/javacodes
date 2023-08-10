package com.app.army;

public class LinkedLnMain {

	public static void main(String[] args) {
		LinkedIn linkedIn=new LinkedIn();
		
		linkedIn.setOwnerName("sana");
	    System.out.println(linkedIn.getOwnerName());
	    linkedIn.setLogoColor("Black");
	    System.out.println(linkedIn.getLogoColor());
	    linkedIn.setUseful(true);
	    System.out.println(linkedIn.isUseful());
	    linkedIn.setCeo("suma");
	    System.out.println(linkedIn.getCeo());
	    linkedIn.setAge(23);
	    System.out.println(linkedIn.getAge());
	    linkedIn.setExp(5);
	    System.out.println(linkedIn.getExp());
	    linkedIn.setWindow("os");
	    System.out.println(linkedIn.getWindow());
	    linkedIn.setWebsite("linkln.com");
	    System.out.println(linkedIn.getWebsite());
	    linkedIn.setAllowImages(true);
	    System.out.println(linkedIn.isAllowImages());
	    linkedIn.setAllowVideos(true);
	    System.out.println(linkedIn.isAllowVideos());
	    linkedIn.setLanguage("erlang");
	    System.out.println(linkedIn.getLanguage());
	    linkedIn.setHeadquater("India");
	    System.out.println(linkedIn.getHeadquater());
	    linkedIn.setSize(34.9f);
	    System.out.println(linkedIn.getSize());
	    linkedIn.setType("personal");
	    System.out.println(linkedIn.getType());
	    System.out.println("\n");
	    
	    
		
	}

}
