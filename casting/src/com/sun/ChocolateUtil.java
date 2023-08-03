package com.sun;

public class ChocolateUtil extends Chocolate{
     public static void run(Chocolate chocolate) {
    	 Chocolate choco=new Chocolate();
    	 if(chocolate instanceof DarkChocolate) {
    		 Chocolate dark=new DarkChocolate();
    		 dark.eat();
    		 DarkChocolate dark1=(DarkChocolate)dark;
    		 dark1.flavour();
    		 
    		 }
    	 if(chocolate instanceof CaramelChocolate) {
    		 Chocolate caramel=new CaramelChocolate ();
    		 caramel.eat();
    		 CaramelChocolate caramel1=(CaramelChocolate)caramel;
    		 caramel1.taste();
    		 
    		 }
    	 
     }
}
