package com.sun.ear;

public class BrowserUtil extends Browser{
	public static void run(Browser browser) {
		Browser b1=new Browser();
		if(browser instanceof ChromeBrowser)
		{
			Browser chrome=new ChromeBrowser();
			chrome.browsing();
			ChromeBrowser chrome1=(ChromeBrowser)chrome;
			chrome1.clear();
			
		 }
		
		if(browser instanceof Edge)
		{
			Browser ed=new Edge();
			ed.browsing();
			Edge edge2=(Edge)ed;
			edge2.info();
			
		
		}

		if(browser instanceof Firefox)
		{
			Browser fox=new Firefox();
			fox.browsing();
			Firefox fox1=(Firefox)fox;
			fox1.getInfo();
			
			 
		}
		if(browser instanceof Opera)
		{
			Browser op1=new Opera();
			op1.browsing();
			Opera op2=(Opera)op1;
			op2.working();
			
			 
		}


		
		
		
	}

}
