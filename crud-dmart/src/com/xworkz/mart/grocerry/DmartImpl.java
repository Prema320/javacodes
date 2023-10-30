package com.xworkz.mart.grocerry;

import java.util.Arrays;

public class DmartImpl implements SuperMarket {
    Grocerry grocerries[];
    int index;
    int id=1;
    public DmartImpl(int size){
         int a=0;

        grocerries=new Grocerry[size];
    }
    public  boolean addAllGroceries(Grocerry grocerry){
        boolean isAdded=false;
        if(grocerry!=null){
            grocerry.setId(id++);
            grocerries[index++]=grocerry;
            isAdded=true;
        }
        return isAdded;
    }
    public  void getAllGroceries(){
        for(int i=0;i<grocerries.length;i++){
            System.out.println(grocerries[i].getGroceryName()+" "+grocerries[i].getPrice()+" "+grocerries[i].getExpiredDate()+" "+grocerries[i].getManufactureDate()+" "+grocerries[i].getWeight()+" "+grocerries[i].getBatchNo());
        }
    }

    public Grocerry getAllGroceriesByName(String name) {
       Grocerry gro=null;
        for (int i = 0; i < this.grocerries.length; i++) {
            if (grocerries[i].getGroceryName().equals(name)) {
                gro = grocerries[i];
                //System.out.println(gro.toString());
            }
        }
        return gro ;
    }

    public  String getGroceryNameByPrice(int price){
        String str=null;
        for (int i=0;i<grocerries.length;i++){
            if(grocerries[i].getPrice()==price){
                str=grocerries[i].getGroceryName();
               // System.out.println(str);
            }
        }
        return str;
    }
    public  int getGroceryPriceByWeight(String weight){
        int price=0;
        for (int i=0;i<grocerries.length;i++){
            if(grocerries[i].getWeight().equals(weight)){
               price =grocerries[i].getPrice();
               // System.out.println(price);
            }
        }
        return price;
    }

    public String getAllGroceryNameByManufactureDate(String  manufactureDate){
        String grocerry=null;
        for (int i=0;i<grocerries.length;i++){
            if(grocerries[i].getManufactureDate().equals(manufactureDate)){
                grocerry=grocerries[i].getGroceryName();
                //System.out.println(grocerry);
            }
        }
       return grocerry;
    }

    public boolean updatePriceByGroceryNames(int price,String names){
        boolean isUpdate=false;
        for(int i=0;i<grocerries.length;i++){
            if (grocerries[i].getGroceryName().equals(names)){
                grocerries[i].setPrice(price);
                isUpdate=true;

            }
        }
        return isUpdate;

    }

    public Grocerry getGroceriesByBatchNo(String batchNo){
        Grocerry gro1=null;
        for (int i=0;i<this.grocerries.length;i++){
            if (grocerries[i].getBatchNo().equals(batchNo)){
               gro1=grocerries[i];
                //System.out.println(gro1.toString());
            }
        }
        return gro1;
    }

    public void deletGroceryByGroceryName(String name) {
        int newi,i;
        for ( i = 0, newi = 0;i < grocerries.length; i++) {
            if (!grocerries[i].getGroceryName().equals(name)) {
                grocerries[newi++] = grocerries[i];
            }
        }
        grocerries = Arrays.copyOf(grocerries, newi);
        getNewGroceries(grocerries);

    }
    public void getNewGroceries(Grocerry[] groces){
        for (Grocerry grocerry:groces){
            System.out.println(grocerry.toString());
        }

    }
    public  void deleteGroceryByBatchNo(String batchNo){
        int newindex,index;
        for (index=0,newindex=0;index<grocerries.length;index++){
            if (grocerries[index].getBatchNo()==batchNo){
                grocerries[newindex++] =grocerries[index];
            }
        }
        grocerries=Arrays.copyOf(grocerries,newindex);
        getNewGroceries(grocerries);

    }
}

