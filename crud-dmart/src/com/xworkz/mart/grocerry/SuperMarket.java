package com.xworkz.mart.grocerry;

public interface SuperMarket {
int a=9;//by default it is static and final(so we can't change the value)

    public  boolean addAllGroceries(Grocerry grocerry);
    public  void getAllGroceries();
    public Grocerry getAllGroceriesByName(String name);
    public  String getGroceryNameByPrice(int price);
    public  int getGroceryPriceByWeight(String weight);
    public String getAllGroceryNameByManufactureDate(String  manufactureDate);
    public boolean updatePriceByGroceryNames(int price,String names);
    public Grocerry getGroceriesByBatchNo(String batchNo);
    public void deletGroceryByGroceryName(String name);
    public void getNewGroceries(Grocerry[] groces);
    public  void deleteGroceryByBatchNo(String batchNo);
}
