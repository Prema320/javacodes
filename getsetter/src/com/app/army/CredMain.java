package com.app.army;

public class CredMain {

	public static void main(String[] args) {
		Cred cred=new Cred();
		
		
		cred.setOwnerName("sujana");
	    System.out.println(cred.getOwnerName());
	    cred.setLogoColor("brown");
	    System.out.println(cred.getLogoColor());
	    cred.setUseful(true);
	    System.out.println(cred.isUseful());
	    cred.setCeo("suma");
	    System.out.println(cred.getCeo());
	    cred.setAge(23);
	    System.out.println(cred.getAge());
	    cred.setExp(5);
	    System.out.println(cred.getExp());
	    cred.setWindow("os");
	    System.out.println(cred.getWindow());
	    cred.setWebsite("cred.com");
	    System.out.println(cred.getWebsite());
	    cred.setAllowImages(true);
	    System.out.println(cred.isAllowImages());
	    cred.setAllowVideos(true);
	    System.out.println(cred.isAllowVideos());
	    cred.setLanguage(".netlang");
	    System.out.println(cred.getLanguage());
	    cred.setHeadquater("India");
	    System.out.println(cred.getHeadquater());
	    cred.setSize(34.9f);
	    System.out.println(cred.getSize());
	    cred.setType("personal");
	    System.out.println(cred.getType());
	    System.out.println("\n");
	    
	}

}
