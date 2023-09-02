package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.GroceryRepository;
import com.xworkz.crud.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {

		GroceryRepository grocery1 = new GroceryRepositoryImpl();
		grocery1.save("sugar");
		grocery1.save("tomato");
		grocery1.save("onion");
		grocery1.save("potato");
		grocery1.save("milk");
		grocery1.save("curd");
		grocery1.save("biscuits");
		grocery1.save("rice");
		grocery1.save("dry fruits");
		grocery1.save("apple");
		grocery1.save("chilli");

		
	}

}
