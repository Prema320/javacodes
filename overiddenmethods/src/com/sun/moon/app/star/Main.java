package com.sun.moon.app.star;

public class Main {

	public static void main(String[] args) {
		Bakery bakery=new Bakery();
		bakery.bake();
		Bakery bakery2=new BakeryMan();
		bakery2.bake();
		System.out.println("\n");
		
		Hotel hotel=new Hotel();
		hotel.rest();
		Hotel hotel2=new TajHotel();
		hotel2.rest();
		System.out.println("\n");
		
		
	    Hospital hospital=new Hospital();
	    hospital.treatment();
	    Hospital hospital2=new BigHospital();
	    hospital2.treatment();
	    System.out.println("\n");
		
	    Hostel hostel=new Hostel();
	    hostel.enjoy();
	    Hostel hostel2=new SchoolHostel();
	    hostel2.enjoy();
	    System.out.println("\n");
		
	    
	    Mall mall=new Mall();
	    mall.shop();
	    Mall mall2=new OrionMall();
	    mall2.shop();
	    System.out.println("\n");
		
	    
	    Theater theater=new Theater();
	    theater.see();
	    Theater theater2=new BigTheater();
	    theater2.see();
	    System.out.println("\n");
		
	    Library library=new Library();
	    library.study();
	    Library library2=new SmallLibrary();
	    library2.study();
	    System.out.println("\n");
		
	    
	    Temple temple=new Temple();
	    temple.peace();
	    Temple temple2=new GoldenTemple();
	    temple2.peace();
	    System.out.println("\n");
		
	    
	    Market market=new Market();
	    market.buy();
	    Market market2=new KrMarket();
	    market2.buy();
	    System.out.println("\n");
		
	    
	    Street street=new Street();
	    street.eat();
	    Street street2=new StreetFood();
	    street2.eat();
	    System.out.println("\n");
		
	    Zoo zoo=new Zoo();
	    zoo.saw();
	    Zoo zoo2=new MysoreZoo();
	    zoo2.saw();
	    System.out.println("\n");
		
	    
	    City city=new City();
	    city.beauty();
	    City city2=new BigCity();
	    city2.beauty();
	    System.out.println("\n");
		
	    Pub pub=new Pub();
	    pub.dance();
	    Pub pub2=new BigPub();
	    pub2.dance();
	    System.out.println("\n");
		
	    
	    PoliceStation policeStation=new PoliceStation();
	    policeStation.job();
	    PoliceStation policeStation2=new SmallPoliceStation();
	    policeStation2.job();
	    

		
		
	}

}
