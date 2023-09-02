package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PatientRepositoryImpl;
import com.xworkz.crud.app.repository.PatioentRepository;

public class PatientRunner {

	public static void main(String[] args) {
	
		PatioentRepository patient=new PatientRepositoryImpl();
		
		patient.treat("prema");
		patient.treat("sowmya");
		patient.treat("shree");
		patient.treat("shilpa");
		patient.treat("omkar");
		patient.treat("suhas");
		patient.treat("keerthi");
		patient.treat("harish");
		patient.treat("mamatha");
		patient.treat("vini");
		patient.treat("varsha");

	}

}
