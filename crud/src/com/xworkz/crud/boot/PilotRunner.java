package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PilotRepository;
import com.xworkz.crud.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		
		PilotRepository pilot=new PilotRepositoryImpl();
		pilot.drive("ajay");
		pilot.drive("yadav");
		pilot.drive("sonu");
		pilot.drive("prema");
		pilot.drive("shivu");
		pilot.drive("akku");
		pilot.drive("ramya");
		pilot.drive("kalpana");
		pilot.drive("beeresh");
		pilot.drive("navya");
		pilot.drive("bhat");
	}

}
