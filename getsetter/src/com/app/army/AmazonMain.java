package com.app.army;

public class AmazonMain {

	public static void main(String[] args) {
		Amazon amazon=new Amazon();

		amazon.setOwnerName("shilpa");
	    System.out.println(amazon.getOwnerName());
	    amazon.setLogoColor("red");
	    System.out.println(amazon.getLogoColor());
	    amazon.setUseful(true);
	    System.out.println(amazon.isUseful());
	    amazon.setCeo("ramya");
	    System.out.println(amazon.getCeo());
	    amazon.setAge(55);
	    System.out.println(amazon.getAge());
	    amazon.setExp(9);
	    System.out.println(amazon.getExp());
	    amazon.setWindow("os");
	    System.out.println(amazon.getWindow());
	    amazon.setWebsite("amazon.com");
	    System.out.println(amazon.getWebsite());
	    amazon.setAllowImages(true);
	    System.out.println(amazon.isAllowImages());
	    amazon.setAllowVideos(true);
	    System.out.println(amazon.isAllowVideos());
	    amazon.setLanguage("pythonlang");
	    System.out.println(amazon.getLanguage());
	    amazon.setHeadquater("USA");
	    System.out.println(amazon.getHeadquater());
	    amazon.setSize(35.8f);
	    System.out.println(amazon.getSize());
	    amazon.setType("public");
	    System.out.println(amazon.getType());
	    System.out.println("\n");
	    
	}

}
