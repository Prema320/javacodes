package com.app.store;

public class RopeRunner {

	public static void main(String[] args) {
		  

		StrongRope rope=new StrongRope();
		System.out.println(rope.name);
		System.out.println(rope.material);
		System.out.println(rope.price);
		System.out.println(rope.color);
		
		StrongRope rope1=new StrongRope("af","plastic",200,"black");
		System.out.println(rope1.name);
		System.out.println(rope1.material);
		System.out.println(rope1.price);
		System.out.println(rope1.color);
	}
	
	

}
