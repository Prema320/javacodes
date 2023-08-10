package com.app.army;

public class InstagramMain {

	public static void main(String[] args) {
		Instagram instagram=new Instagram();
	    instagram.setOwnerName("prema");
	    System.out.println(instagram.getOwnerName());
	    instagram.setLogoColor("green");
	    System.out.println(instagram.getLogoColor());
	    instagram.setUseful(true);
	    System.out.println(instagram.isUseful());
	    instagram.setCeo("sonu");
	    System.out.println(instagram.getCeo());
	    instagram.setAge(23);
	    System.out.println(instagram.getAge());
	    instagram.setExp(5);
	    System.out.println(instagram.getExp());
	    instagram.setWindow("os");
	    System.out.println(instagram.getWindow());
	    instagram.setWebsite("instagram.com");
	    System.out.println(instagram.getWebsite());
	    instagram.setAllowImages(true);
	    System.out.println(instagram.isAllowImages());
	    instagram.setAllowVideos(true);
	    System.out.println(instagram.isAllowVideos());
	    instagram.setLanguage("javalang");
	    System.out.println(instagram.getLanguage());
	    instagram.setHeadquater("India");
	    System.out.println(instagram.getHeadquater());
	    instagram.setSize(34.9f);
	    System.out.println(instagram.getSize());
	    instagram.setType("and");
	    System.out.println(instagram.getType());
	    System.out.println("\n");
	}

}
