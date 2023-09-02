package com.xworkz.crud.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository {
	
	String[] str=new String[10];
	int position;

	@Override
	public void dance(String artist) {
		System.out.println("invoke dance in artistrepositoryimpl");
		if(position<ARTIST_NAME) {
		this.str[position]=artist;
		System.out.println("artish name is " +artist+ " in the position " +this.position);
		this.position++;
		}
		else
		{
			System.err.println("out of name it is already filled");
		}
		
	}
	
	

}
