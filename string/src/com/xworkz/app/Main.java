package com.xworkz.app;

public class Main {

	public static void main(String[] args) {
		
		Logo logo=new Logo("tcs","blue","ravi",true,5);
	    System.out.println(logo);
	    Logo logo2=new Logo();
	    System.out.println(logo2);
	    Logo logo3=new Logo("wipro","green","suma",false,6);
	    System.out.println(logo3);
		System.out.println("\n");
		
		Karchief karchief=new Karchief(30,"pink","square","cotton","bandana","Richard",true);
		String ref1=karchief.toString();
		System.out.println(ref1);
		Karchief karchief2=new Karchief(20,"white","rectangle","cotton","bandana","raju",false);
		System.out.println(karchief2);
		Karchief karchief3=new Karchief();
		System.out.println(karchief3);
		System.out.println("\n");
		
		Cave cave=new Cave("gold","India","rocks",true,5,32.8f,"cavern","Barber hill",false,true);
		String ref2=cave.toString();
		System.out.println(ref2);
		Cave cave2=new Cave("brown","china","soil",false,5,32.8f,"cavern","raghu hill",false,false);
		System.out.println(cave2);
		Cave cave3=new Cave();
		System.out.println(cave3);
		System.out.println("\n");
		
		
		Pendant pendant=new Pendant("platinum",2000,"silver",2.2f,true,false,5,"heart",3.4f,2.4,5,"pendent");
		String ref3=pendant.toString();
		System.out.println(ref3);
		Pendant pendant2=new Pendant("gold",4000,"golden",1.2f,true,true,5,"oven",3.8f,3.4,5,"pendent");
		System.out.println(pendant2);
		Pendant pendant3=new Pendant();
		System.out.println(pendant3);
		System.out.println("\n");
		
		
		
		
		
		
		
		
	}

}
