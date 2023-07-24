public class Helmat{
	String brand;
	double price;
	static char  size;
	static String shopName;
	
	
	public void InstanceMethod(){
		System.out.println("brand:"+ brand);
		System.out.println("Price:"+ price);
	}
	
	
	static void staticMethod(){
		System.out.println("size:"+size);
		System.out.println("shopName:"+shopName);
	}
	
	Helmat(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	
	
	static{
		size = 's';
		shopName = "vishnuShop";
	}
}