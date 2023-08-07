package com.app.sun.moon;

public class Umbrella {
  public String color;
  public int price;

  public void protect() {
	   System.out.println("invoking no args og protect");
	   protect("pink");
	   protect(300);
	   protect("blue",230);
  }
  public void protect(String color) {
	   System.out.println("invoking string args og protect");
	   System.out.println("color"+color);
  }
  public void protect(int price) {
	   System.out.println("invoking int args og protect");
	   System.out.println("price"+price);
  }
  public void protect(String color,int price) {
	   System.out.println("invoking string.int args og protect");
	   System.out.println("color"+color);
	   System.out.println("price"+price);
	   
  }
}
