package com.app.sun;

public class Ladder {
public String material;
public int price;
public void climb() {
	System.out.println("invoking no args of climb");
	climb("wood");
	climb(300);
	climb("steel",500);
	
}
public void climb(String material) {
	System.out.println("invoking string args of climb");
	System.out.println("material"+material);
}
public void climb(int price) {
	System.out.println("invoking int args of climb");
	System.out.println("price"+price);
}
public void climb(String material,int price) {
	System.out.println("invoking string,int   args of climb");
	System.out.println("material"+material);
	System.out.println("price"+price);
}

}
