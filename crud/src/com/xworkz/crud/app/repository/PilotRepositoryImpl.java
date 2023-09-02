package com.xworkz.crud.app.repository;

public class PilotRepositoryImpl implements PilotRepository {
	
	String[] str=new String[PILOT_NAME];
	int pos;

	@Override
	public void drive(String name) {
		System.out.println("invoke drive in PilotRepository");
		if(pos<PILOT_NAME)
		{
			this.str[pos]=name;
			System.out.println("pilot name"+name+ "at the pos"+this.pos);
			this.pos++;
		
	}
		else
		{
			System.out.println("out of stock");
		}

}
}
