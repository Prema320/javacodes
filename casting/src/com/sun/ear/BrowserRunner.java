package com.sun.ear;

public class BrowserRunner {

	public static void main(String[] args) {
		 
		Browser browser=new Browser();
		ChromeBrowser chromebrowser=new ChromeBrowser();
		Edge edge=new Edge();
		Firefox firefox=new Firefox();
		Opera opera=new Opera();
		
		BrowserUtil utli=new BrowserUtil();
		System.out.println("invoking run in browser");
		System.out.println(browser.button);
		utli.run(browser);
		
		BrowserUtil utli1=new BrowserUtil();
		System.out.println("invoking run in chromebrowser");
		System.out.println(chromebrowser.button);
		System.out.println(chromebrowser.color);
		utli1.run(chromebrowser);
		
		BrowserUtil util2=new BrowserUtil();
		System.out.println("invoking run in edge");
		System.out.println(edge.button);
		System.out.println(edge.company);
		util2.run(edge);
		
		BrowserUtil utli3=new BrowserUtil();
		System.out.println("invoking run in firefox");
		System.out.println(firefox.button);
		System.out.println(firefox.ceo);
		utli3.run(firefox);
		
		BrowserUtil utli4=new BrowserUtil();
		System.out.println("invoking run in opera");
		System.out.println(opera.button);
		System.out.println(opera.noOfEmploees);
		utli4.run(opera);
		
		
	}

}
