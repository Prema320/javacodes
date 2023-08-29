package com.xworkz.app.shot;

public class Wood {

	public float weight;
	public Paper paper;

	public Wood(float weight) {
		this.weight = weight;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void cut() {
		System.out.println("wood can be cut");
		this.paper.write();
	}

}
