package com.xworkz.crud.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	
	String[] str=new String[POLITICIAN_NAME];
	int position;
	@Override
	public void serve(String name)
	{
		System.out.println("invoke serve in PoliticianRepositoryimpl");
		
		if(position<POLITICIAN_NAME) {
			this.str[position]=name;
			System.out.println("politician name "+name+ "is atb the position "+this.position);
		    this.position++;
		}
		else
		{
			System.err.println("out of stock");
		}
	}
	
	

}
