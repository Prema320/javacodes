package com.app.army;

public class YoutubeMain {

	public static void main(String[] args) {
		Youtube youtube=new Youtube();
		
		youtube.setOwnerName("shilpa");
	    System.out.println(youtube.getOwnerName());
	    youtube.setLogoColor("red");
	    System.out.println(youtube.getLogoColor());
	    youtube.setUseful(true);
	    System.out.println(youtube.isUseful());
	    youtube.setCeo("ramya");
	    System.out.println(youtube.getCeo());
	    youtube.setAge(55);
	    System.out.println(youtube.getAge());
	    youtube.setExp(9);
	    System.out.println(youtube.getExp());
	    youtube.setWindow("os");
	    System.out.println(youtube.getWindow());
	    youtube.setWebsite("youtube.com");
	    System.out.println(youtube.getWebsite());
	    youtube.setAllowImages(true);
	    System.out.println(youtube.isAllowImages());
	    youtube.setAllowVideos(true);
	    System.out.println(youtube.isAllowVideos());
	    youtube.setLanguage("c++lang");
	    System.out.println(youtube.getLanguage());
	    youtube.setHeadquater("India");
	    System.out.println(youtube.getHeadquater());
	    youtube.setSize(35.8f);
	    System.out.println(youtube.getSize());
	    youtube.setType("public");
	    System.out.println(youtube.getType());
	    System.out.println("\n");
	    
	    
	}

}
