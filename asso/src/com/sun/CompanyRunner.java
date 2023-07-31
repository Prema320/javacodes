package com.sun;

public class CompanyRunner {

	public static void main(String[] args) {

		String pasteName = "colgate";
		String brand = "colgate";
		Company company = new Company("DaberRed", "sona", "India");
		Ingridents i = new Ingridents("salt", 3.0f, 10);
		Ingridents i1 = new Ingridents("water", 2.0f, 5);
        Ingridents i2 = new Ingridents("zinc",2.0f,15);
        Ingridents i3 = new Ingridents("silica", 3.0f, 13);
        Ingridents i4 = new Ingridents("phospate", 4.0f, 20);
        Ingridents[] ingridents= {i,i1,i2,i3,i4};
        Toothpaste toothpaste=new Toothpaste(pasteName,brand,company,ingridents);

		toothpaste.printInfo();
	}

}
