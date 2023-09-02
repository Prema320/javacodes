package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MedicineRepository;
import com.xworkz.crud.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		
		MedicineRepository medi=new MedicineRepositoryImpl();
		medi.cure("dolo");
		medi.cure("ativan");
		medi.cure("adderall");
		medi.cure("naproxen");
		medi.cure("citrazen");
		medi.cure("rantac");
		medi.cure("amlodipine");
		medi.cure("morphine");
		medi.cure("paracetamel");
		medi.cure("tramadol");
		medi.cure("fentanyl");
		
		
			}

}
