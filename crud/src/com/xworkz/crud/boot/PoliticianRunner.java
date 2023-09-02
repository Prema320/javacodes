package com.xworkz.crud.boot;


import com.xworkz.crud.app.repository.PoliticianRepository;
import com.xworkz.crud.app.repository.PoliticianRepositoryImpl;

public class PoliticianRunner {
	public static void main(String[] args) {
		
	
	
	
	PoliticianRepository polit =new PoliticianRepositoryImpl();
	polit.serve("narendra modi");
	polit.serve("gadgil");
	polit.serve("geetha");
	polit.serve("jeevan");
	polit.serve("harish ");
	polit.serve("murmu");
	polit.serve("dhankar");
	polit.serve("nehru");
	polit.serve("ambedkar");
	polit.serve("jatti");
	polit.serve("manju nai");
	
	}

}
