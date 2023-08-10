package com.app.army;

public class Snapchatmain {
	public static void main(String[] args) {
		Snapchat snapchat=new Snapchat();

	snapchat.setOwnerName("sanju");
    System.out.println(snapchat.getOwnerName());
    snapchat.setLogoColor("yellow");
    System.out.println(snapchat.getLogoColor());
    snapchat.setUseful(true);
    System.out.println(snapchat.isUseful());
    snapchat.setCeo("ranju");
    System.out.println(snapchat.getCeo());
    snapchat.setAge(55);
    System.out.println(snapchat.getAge());
    snapchat.setExp(9);
    System.out.println(snapchat.getExp());
    snapchat.setWindow("linux");
    System.out.println(snapchat.getWindow());
    snapchat.setWebsite("snapchat.com");
    System.out.println(snapchat.getWebsite());
    snapchat.setAllowImages(true);
    System.out.println(snapchat.isAllowImages());
    snapchat.setAllowVideos(false);
    System.out.println(snapchat.isAllowVideos());
    snapchat.setLanguage("clang");
    System.out.println(snapchat.getLanguage());
    snapchat.setHeadquater("America");
    System.out.println(snapchat.getHeadquater());
    snapchat.setSize(35.8f);
    System.out.println(snapchat.getSize());
    snapchat.setType("public");
    System.out.println(snapchat.getType());
    System.out.println("\n");
    
	}
}
