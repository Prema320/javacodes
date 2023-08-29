package com.xworkz.app.shot;

public class Laptops {

	public Processor processor;

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void takePicture() {
		System.out.println("by using laptop we can take picture");
		this.processor.instruction();
		this.processor.power();
		this.processor.respond();
		this.processor.speed();
	}

}
