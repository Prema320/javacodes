package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.HistoricalPlaceRepository;
import com.xworkz.crud.app.repository.HistoricalPlaceRepositoryImpl;

public class HistoricalPlaceRunner {

	public static void main(String[] args) {
		HistoricalPlaceRepository histo=new HistoricalPlaceRepositoryImpl();
		histo.visit("halebidu");
		histo.visit("badami");
		histo.visit("aihole");
		histo.visit("hampi");
		histo.visit("duddsagar");
		histo.visit("dandeli");
		histo.visit("halebidu");
		histo.visit("srirangapatna");
		histo.visit("bangalore");
		histo.visit("mysore");
		histo.visit("red fort");


	}

}
