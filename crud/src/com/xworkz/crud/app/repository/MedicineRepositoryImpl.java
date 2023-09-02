package com.xworkz.crud.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository {
	
	String[] str=new String[MEDI_NAME];
	int position;

	@Override
	public void cure(String medName) {
		
		System.out.println("invoke cure in MedicineRepositoryImpl ");
		if(position<MEDI_NAME) {
		this.str[position]=medName;
		System.out.println("med name "+medName+ " at the pos "+this.position);
		this.position++;
		}
		else
		{
			System.err.println("out of stock");
		}
		
	}
	
	
	

}
