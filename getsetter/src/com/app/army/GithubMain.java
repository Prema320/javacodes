package com.app.army;

public class GithubMain {

	public static void main(String[] args) {
		
		Github github=new Github();
		
		github.setOwnerName("sowmya");
	    System.out.println(github.getOwnerName());
	    github.setLogoColor("black");
	    System.out.println(github.getLogoColor());
	    github.setUseful(true);
	    System.out.println(github.isUseful());
	    github.setCeo("raju");
	    System.out.println(github.getCeo());
	    github.setAge(25);
	    System.out.println(github.getAge());
	    github.setExp(5);
	    System.out.println(github.getExp());
	    github.setWindow("mac");
	    System.out.println(github.getWindow());
	    github.setWebsite("github.com");
	    System.out.println(github.getWebsite());
	    github.setAllowImages(true);
	    System.out.println(github.isAllowImages());
	    github.setAllowVideos(true);
	    System.out.println(github.isAllowVideos());
	    github.setLanguage("c++lang");
	    System.out.println(github.getLanguage());
	    github.setHeadquater("Newyork");
	    System.out.println(github.getHeadquater());
	    github.setSize(34.9f);
	    System.out.println(github.getSize());
	    github.setType("Enterprise");
	    System.out.println(github.getType());
	    System.out.println("\n");
	}

}
