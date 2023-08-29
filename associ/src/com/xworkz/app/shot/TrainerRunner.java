package com.xworkz.app.shot;

public class TrainerRunner {

	public static void main(String[] args) {

		int age = 30;
		Trainer trainer = new Trainer(age);
		Laptop laptop = new Laptop();
		trainer.setLaptop(laptop);
		trainer.working();
		System.out.println(trainer.age);
	}

}
