package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.ArtistRepository;
import com.xworkz.crud.app.repository.ArtistRepositoryImpl;

public class AtristRunner {

	public static void main(String[] args) {
		ArtistRepository artist=new ArtistRepositoryImpl();
		artist.dance("sonu");
		artist.dance("shreya");
		artist.dance("darshan");
		artist.dance("sudeep");
		artist.dance("yash");
		artist.dance("vishnu");
		artist.dance("punith");
		artist.dance("raghu");
		artist.dance("anu");
		artist.dance("priya");
		artist.dance("seema");
		
		
		
	}

}
