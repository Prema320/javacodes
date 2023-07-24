class Candle{
	double price;
	String color;
	static String brightness ;
	static int temperature;
	
	
	
	public void InstanceMethod(){
		System.out.println("price: " + price);
		System.out.println("color: " + color);
	}
	
	static void StaticMethod(){
		System.out.println("brightness: " + brightness);
		System.out.println("temperature: " + temperature);
	}
	
	Candle(double price,String color){
		this.color = color;
		this.price = price;
	}
	
	static{
		brightness = "high";
		temperature = 45;
	}
}