package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.JacketRepository;
import com.xworkz.crud.app.repository.JacketRepositoryImpl;

public class JacketRunner {

	public static void main(String[] args) {

		JacketRepository jacket = new JacketRepositoryImpl();
		jacket.wear("moncher");
		jacket.wear("levis");
        jacket.wear("nike");
		jacket.wear("north face");
        jacket.wear("belstaff");
        jacket.wear("burberry");
        jacket.wear("gucci");
        jacket.wear("saint");
        jacket.wear("tommy");
        jacket.wear("puma");
        jacket.wear("adidas");

	}

}
