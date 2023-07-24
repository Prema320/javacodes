class Bureau{
	int price;
	char size;
	static String ownerName;
	static String material;
	
	 
	
	public void instanceMethod(){
		System.out.println("price:"+price);
		System.out.println("size:"+size);
	
	}
	
	static void staticMethod(){
		System.out.println(" ownerName:"+ownerName);
	    System.out.println(" material:"+material);
	}
	
	
	Bureau(int price, char size){
		this.price = price;
		this.size = size;
	}
	
	static{
		ownerName = "shashi";
		material = "Metal";
	}
} 