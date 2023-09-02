package com.xworkz.crud.app.repository;

public class PatientRepositoryImpl implements PatioentRepository{
	
	String[] str=new String[PATIENT_NAME];
int position;
	
	@Override
	public void treat(String name) {
		System.out.println("invoke treat in PatientRepositoryImpl");
		if(position<PATIENT_NAME) {
		this.str[position]=name;
		System.out.println("patient name " +name+ "is at the position " +this.position);
		this.position++;
		}
		else
		{
			System.err.println("out of stock");
		}
		
	}

}
