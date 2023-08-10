package com.app.army;

public class RapidoMain {

	public static void main(String[] args) {
		Rapido rapido=new Rapido();
		
		rapido.setOwnerName("sagar");
	    System.out.println(rapido.getOwnerName());
	    rapido.setLogoColor("Blue");
	    System.out.println(rapido.getLogoColor());
	    rapido.setUseful(true);
	    System.out.println(rapido.isUseful());
	    rapido.setCeo("roja");
	    System.out.println(rapido.getCeo());
	    rapido.setAge(55);
	    System.out.println(rapido.getAge());
	    rapido.setExp(9);
	    System.out.println(rapido.getExp());
	    rapido.setWindow("mac");
	    System.out.println(rapido.getWindow());
	    rapido.setWebsite("facebook.com");
	    System.out.println(rapido.getWebsite());
	    rapido.setAllowImages(true);
	    System.out.println(rapido.isAllowImages());
	    rapido.setAllowVideos(true);
	    System.out.println(rapido.isAllowVideos());
	    rapido.setLanguage("clang");
	    System.out.println(rapido.getLanguage());
	    rapido.setHeadquater("India");
	    System.out.println(rapido.getHeadquater());
	    rapido.setSize(35.8f);
	    System.out.println(rapido.getSize());
	    rapido.setType("personal");
	    System.out.println(rapido.getType());
	    System.out.println("\n");
	    

	}

}
