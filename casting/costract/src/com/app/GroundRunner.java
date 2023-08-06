package com.app;

public class GroundRunner {

	public static void main(String[] args) {
		
		PlayGround play=new PlayGround();
		System.out.println(play.name);
		System.out.println(play.location);
		System.out.println(play.noOfGates);
		System.out.println(play.noOfGrounds);
		

		PlayGround play1=new PlayGround("suma","udupi",3,4);
		System.out.println(play1.name);
		System.out.println(play1.location);
		System.out.println(play1.noOfGates);
		System.out.println(play1.noOfGrounds);
		
		
		
			}

}
