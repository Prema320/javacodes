 class AllFile{
	public static void main(String[] args){
		
		Helmat helmat = new Helmat("aa",500);
		helmat.InstanceMethod();
		Helmat.staticMethod();
		System.out.println("\n");
		
		Candle candle = new Candle(10,"white");
		candle.InstanceMethod();
		Candle.StaticMethod();
		System.out.println("\n");
		
		Brick brick = new Brick("ravi",450);
		brick.InstanceMethod();
		Brick.StaticMethod();
		System.out.println("\n");
		
		Soil soil = new Soil("sandy", true);
		soil.InstanceMethod();
		Soil.StaticMethod();
		System.out.println("\n");
		
		ButterFly butterfly = new ButterFly("pink",2);
		butterfly.instanceMethod();
		ButterFly.staticMethod();
		System.out.println("\n");
		
		Power power = new Power("p=e/t",true);
		power.instanceMethod();
		Power.staticMethod();
		System.out.println("\n");
		
		Bureau bureau = new Bureau(9000, 'M');
		bureau.instanceMethod();
		Bureau.staticMethod();
	}
}