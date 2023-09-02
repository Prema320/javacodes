package com.xworkz.crud.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {

	 private String[] gro = new String[TOTAL_ITEMS];
	private int position; 

	@Override
	public void save(String grocery) {
		System.out.println("invoke save in GroceryRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.gro[position] = grocery;
			System.out.println("stored  " + grocery + " is in the position " + this.position);
			this.position++;
		} else {
			System.err.println("storage is full");
		}

	}

}
