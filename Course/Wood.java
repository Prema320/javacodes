class Wood{
String color;
int price;
double density;
String woodShopName;
String owner;
	
	Wood(String color)
	{
		System.out.println("invoking  string cost of wood ");
	}
	Wood(String color,int price)
	{
		this(color);
		this.price=price;
		System.out.println("invoking  string,price cost of wood ");
	}
	Wood(String color,int price,double density)
	{
		this( color,price);
		this.density=density;
		System.out.println("invoking  string,price,density cost of wood ");
	}
	
	Wood(String color,int price,double density,String woodShopName)
	{
		this(color,price,density);
		this.woodShopName=woodShopName;
		System.out.println("invoking  string,price,density,woodshop cost of wood ");
	}
		Wood(String color,int price,double density,String woodShopName,String owner)
	{
		this(color,price,density,woodShopName);
		this.owner=owner;
		System.out.println("invoking  string,price,density,woodshop,owner cost of wood ");
	}
	
	
	
	
	
	
	
}