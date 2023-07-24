class Power{
	String powerFormula;
	boolean efficiency; 
	static String powerUnit; 
	static char powerSymbol; 
	 
	
	public void instanceMethod(){
		System.out.println("powerFormula:"+powerFormula);
		System.out.println("efficiency:"+efficiency);
	}
	
	static void staticMethod(){
		System.out.println("powerUnit:"+powerUnit);
		System.out.println("powerSymbol:"+powerSymbol);
		
	}
	
	Power(String powerFormula,boolean efficiency ){
		this.powerFormula = powerFormula;
		this.efficiency = efficiency;
	}
	
	static{
		powerUnit = "Watt";
		powerSymbol = 'P';
	}
}