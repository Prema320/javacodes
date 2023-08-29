package com.xworkz.app.shot;

public class PassengerRunner {

	public static void main(String[] args) {

		Passenger passenger = new Passenger("sonu");
		Bus bus = new Bus();
		passenger.setBus(bus);
		passenger.travel();
		System.out.println(passenger.name);

	}

}
