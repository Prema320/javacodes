package com;

public class BrandUtil extends Brand{
	
	public static void run(Brand brand) {
		Brand b1=new Brand();
		if(brand instanceof LocalBrand) {
			Brand bran1=new LocalBrand();
			bran1.famous();
			LocalBrand bran2=(LocalBrand)bran1;
			bran2.service();
			
		}
		
		if(brand instanceof NationalBrand) {
			Brand natio=new NationalBrand();
			natio.famous();
			NationalBrand natio1=(NationalBrand)natio;
			natio1.provider();
			
		}
		
		if(brand instanceof DuplicateBrand) {
			Brand duplic=new DuplicateBrand();
			duplic.famous();
			DuplicateBrand duplic1=(DuplicateBrand)duplic;
			duplic1.colorful();
			
		}
		
		if(brand instanceof InternationalBrand) {
			Brand inter=new InternationalBrand();
			inter.famous();
			InternationalBrand inter1=(InternationalBrand)inter;
			inter1.identity();
			
		}
		
		
	}

}
