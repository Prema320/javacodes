package com.sun.ear.eye;

public class ShowroomUtil extends Showroom {
	public static void run(Showroom showroom) {
		Showroom show=new Showroom();
		show.clean();
		Showroom watch=new WatchShowroom();
		watch.clean();
		
		//if(showroom instanceof WatchShowroom)
		//{
			

			WatchShowroom watch2=(WatchShowroom)watch;
			watch2.sell();

		//}

		//if(showroom instanceof MobileShowroom)
		//{
			Showroom mobile = new MobileShowroom();
			mobile.clean();

			MobileShowroom mobile2=(MobileShowroom)mobile;
			mobile2.buy();
		//}
		
	}
	
	

}
