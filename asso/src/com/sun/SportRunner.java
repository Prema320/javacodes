package com.sun;

public class SportRunner {

	public static void main(String[] args) {
		
         String name="kabbadi";
		
		Floor f1=new Floor("groundfloor",0);
		Floor f2=new Floor("1stfloor",1);
		Floor f3=new Floor("2ndfloor",2);
		Floor f4=new Floor("3rdfloor",3);
		Floor f5=new Floor("4thfloor",4);
		Floor f6=new Floor("5thfloor",5);
		Floor f7=new Floor("6thfloor",6);
		Floor[] floor= {f1,f2,f3,f4,f5,f6,f7};
		
		Lift l1=new Lift(1);
		Lift l2=new Lift(2);
		Lift[] lift= {l1,l2};

		Building b1=new Building(floor,lift);
		Building b2=new Building(floor,lift);
		Building[] building= {b1,b2};
		
		Corporator c1=new Corporator("prema",building);
		Area a1=new Area("BTM",c1);
		Area a2=new Area("Rajajinagar",c1);
		Area[] area = {a1,a2};
		
		HomeTown town=new HomeTown("Davanager",577601,area);
		Player p1=new Player("prema",15,building,town);
		Player p2=new Player("virat",10,building,town);
		Player[] player= {p1,p2};
 		
		Sport s1=new Sport(name,player);
		s1.printInfo();
		
		
		
		
		
		
	}

}
