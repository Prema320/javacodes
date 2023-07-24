class Brick{
	String shopName;
	int price;
	static String shape;
	static String color;
	
	public void InstanceMethod(){
		System.out.println("shopName:"+shopName);
		System.out.println("price:"+price);
	}
	
	static void StaticMethod(){
		System.out.println("shape:"+shape);
		System.out.println("color:"+color);
	}
	
	Brick(String shopName, int price){
		this.shopName = shopName;
		this.price = price;
	}
	
	static{
		shape = "rectangle";
		color = "Red ";
		
	}
}