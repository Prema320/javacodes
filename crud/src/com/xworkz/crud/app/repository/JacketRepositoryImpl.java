package com.xworkz.crud.app.repository;

public class JacketRepositoryImpl implements JacketRepository {
	
	String[] str=new String[JACKET_BRANDS];
	int pos;

	@Override
	public void wear(String name) {
		System.out.println("invoke wear in JacketRepositoryimpl");
		
		if(pos<JACKET_BRANDS)
		{
			this.str[pos]=name;
			System.out.println("jacket brand "+name+ "at the pos" +this.pos);
		    this.pos++;
		}
		else
		{
			System.err.println("out of stock");
		}
	}
	
	

}
