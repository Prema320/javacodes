package com;

public class Mouse {
public int noOfButtons;
public String color;

public void operate() {
	System.out.println("invoking no args in operate");
	operate(3);
	operate("black");
	operate(2,"red");
}
public void operate(int noOfButtons) {
	System.out.println("invoking int args in operate");
	System.out.println("noOfButtons"+noOfButtons);
}
public void operate(String color) {
	System.out.println("invoking string args in operate");
	System.out.println("color"+color);
}
public void operate(int noOfButtons,String color) {
	System.out.println("invoking int,string args in operate");
	System.out.println("noOfButtons"+noOfButtons);
	System.out.println("color"+color);
	
}
}
