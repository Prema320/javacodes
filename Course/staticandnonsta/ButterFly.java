class ButterFly{
	String color;
	int legs;
	static boolean insect;
	static int wings;
	
	
	public void instanceMethod(){
		System.out.println("color:"+color);
	    System.out.println("legs:"+legs);
	}
	
	static void staticMethod(){
		System.out.println("insect:"+insect);
		System.out.println("wings:"+wings);
	}
	
	ButterFly(String color,int legs){
		this.color = color;
		this.legs = legs;
	}
	
	static{
		insect = true;
		wings = 4;
	}
}