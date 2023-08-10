package com.app.army;

public class IrctcMain {

	public static void main(String[] args) {
		Irctc irctc=new Irctc();
		
		irctc.setOwnerName("shivani");
	    System.out.println(irctc.getOwnerName());
	    irctc.setLogoColor("white");
	    System.out.println(irctc.getLogoColor());
	    irctc.setUseful(true);
	    System.out.println(irctc.isUseful());
	    irctc.setCeo("Anu");
	    System.out.println(irctc.getCeo());
	    irctc.setAge(55);
	    System.out.println(irctc.getAge());
	    irctc.setExp(9);
	    System.out.println(irctc.getExp());
	    irctc.setWindow("mac");
	    System.out.println(irctc.getWindow());
	    irctc.setWebsite("irctc.com");
	    System.out.println(irctc.getWebsite());
	    irctc.setAllowImages(true);
	    System.out.println(irctc.isAllowImages());
	    irctc.setAllowVideos(true);
	    System.out.println(irctc.isAllowVideos());
	    irctc.setLanguage("c+++lang");
	    System.out.println(irctc.getLanguage());
	    irctc.setHeadquater("NewDelhi");
	    System.out.println(irctc.getHeadquater());
	    irctc.setSize(35.8f);
	    System.out.println(irctc.getSize());
	    irctc.setType("public");
	    System.out.println(irctc.getType());
	    System.out.println("\n");
	    
		

	}

}
