class Soil{
    String type;
	boolean naturalResource;
	static String color;
	static double price;
	
	public void InstanceMethod(){
		System.out.println("type: " + type);
		System.out.println("naturalResource: " + naturalResource);
	}
	
	static void StaticMethod(){
		System.out.println("color: " + color);
		System.out.println("price: " + price);
	}
	
	Soil(String type, boolean naturalResource ){
		this.type = type;
		this.naturalResource = naturalResource;
	}
	
	static{
		color = "black";
		price = 500;
	}
}