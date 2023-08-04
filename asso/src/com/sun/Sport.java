package com.sun;

public class Sport {
	public String name;
	public Player[] player;
	public Sport(String name,Player[] player) {
		this.name=name;
		this.player=player;
	}
	public void printInfo() {
		System.out.println("name:"+this.name);
		for(int i=0;i<this.player.length;i++) {
			Player ref=this.player[i];
			ref.printInfo();
		}

	}

}
