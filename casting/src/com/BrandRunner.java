package com;

public class BrandRunner {

	public static void main(String[] args) {
		Brand brand=new Brand();
		LocalBrand localbrand=new LocalBrand();
		NationalBrand nationalbrand=new NationalBrand();
		DuplicateBrand duplicatebrand=new DuplicateBrand();
		InternationalBrand internationalbrand=new InternationalBrand();
		
		BrandUtil util=new BrandUtil();
		System.out.println("invoking run in brand");
		System.out.println(brand.name);
		util.run(brand);
		
		BrandUtil util1=new BrandUtil();
		System.out.println("invoking run in localbrand");
		System.out.println(localbrand.name);
		System.out.println(localbrand.name);
		util1.run(localbrand);
		
		BrandUtil util2=new BrandUtil();
		System.out.println("invoking run in nationalbrand");
		System.out.println(nationalbrand.name);
		System.out.println(nationalbrand.color);
		util2.run(nationalbrand);
		
		BrandUtil util3=new BrandUtil();
		System.out.println("invoking run in duplicatebrand");
		System.out.println(duplicatebrand.name);
		System.out.println(duplicatebrand.name);
		util3.run(duplicatebrand);
		
		BrandUtil util4=new BrandUtil();
		System.out.println("invoking run in internationalbrand");
		System.out.println(internationalbrand.name);
		System.out.println(internationalbrand.name);
		util4.run(internationalbrand);
		

		
		
		
	}

}
