package com.sun.moon.app.star;

public class KrMarket extends Market{

	@Override
	public void buy() {
		System.out.println("invoking buy in krmarket");
		super.buy();
	}

	@Override
	public void buy(String marketName) {
		System.out.println("invoking string in krmarket");
		super.buy(marketName);
	}

	@Override
	public void buy(String marketName, String shopName) {
		System.out.println("invoking string,string in krmarket");
		super.buy(marketName, shopName);
	}

	@Override
	public void buy(String marketName, String shopName, String ownerName) {
		System.out.println("invoking string,string,string in krmarket");
		super.buy(marketName, shopName, ownerName);
	}

	@Override
	public void buy(String marketName, String shopName, String ownerName, int noofShops) {
		System.out.println("invoking string,string,string,int in krmarket");
		super.buy(marketName, shopName, ownerName, noofShops);
	}

	@Override
	public void buy(String marketName, String shopName, String ownerName, int noofShops, boolean near) {
		System.out.println("invoking string,string,string,int,boolean in krmarket");
		super.buy(marketName, shopName, ownerName, noofShops, near);
	}

}
