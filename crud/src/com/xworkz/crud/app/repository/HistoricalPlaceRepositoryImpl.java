package com.xworkz.crud.app.repository;

public class HistoricalPlaceRepositoryImpl implements HistoricalPlaceRepository {
 
	String[] str=new String[PLACE_NAME];
	int position;
	
	@Override
	public void visit(String placeName) {
		System.out.println("invoke visit in HistoricalPlaceRepositoryimpl");
		
		if(position<PLACE_NAME) {
			this.str[position]=placeName;
			System.out.println("place name "+placeName+ " at the pos "+this.position);
			this.position++;
		}
		else
		{
			System.err.println("out of stock");
		}
	}

}
