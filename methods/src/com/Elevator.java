package com;

public class Elevator {
	public String color;
	public boolean safety;
	 
	public void safe() {
		System.out.println("invoking no args safe");
		safe("gold");
		safe(true);
		safe("black",false);
	}
	public void safe(String color) {
		System.out.println("invoking string args safe");
		System.out.println("color"+color);
	}
	public void safe(boolean safety) {
		System.out.println("invoking boolean args safe");
		System.out.println("safety"+safety);
	}
	public void safe(String color,boolean safety) {
		System.out.println("invoking string,boolean args safe");
		System.out.println("color"+color);
		System.out.println("safety"+safety);
	}

}
