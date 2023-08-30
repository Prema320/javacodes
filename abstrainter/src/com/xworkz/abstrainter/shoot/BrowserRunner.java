package com.xworkz.abstrainter.shoot;

public class BrowserRunner {

	public static void main(String[] args) {
		
		Internet internet=new FourgNetwork();
		Browser browser=new Browser();
		browser.setInternet(internet);
		browser.connect();
			}

}
