package com.xworkz.mart.dmart;

import com.xworkz.mart.grocerry.DmartImpl;
import com.xworkz.mart.grocerry.Grocerry;
import com.xworkz.mart.grocerry.SuperMarket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of groceries added");
        int size = sc.nextInt();
        SuperMarket dmart = new DmartImpl(size);
        for (int i = 0; i < size; i++) {
            Grocerry grocerry = new Grocerry();
            System.out.println("enter the groceryName");
            grocerry.setGroceryName(sc.next());
            System.out.println("enter the price");
            grocerry.setPrice(sc.nextInt());
            System.out.println("enter the manufacturedate");
            grocerry.setManufactureDate(sc.next());
            System.out.println("enter the expiredDate");
            grocerry.setExpiredDate(sc.next());
            System.out.println("enter the weight");
            grocerry.setWeight(sc.next());
            System.out.println("enter the batchNo");
            grocerry.setBatchNo(sc.next());
            dmart.addAllGroceries(grocerry);
        }

        String str = null;
        do {
            System.out.println("press 1:to get all groceries");
            System.out.println("press 2:to  getAllGroceriesByName");
            System.out.println("press 3:to  getGroceryNameByPrice");
            System.out.println("press 4:to  getGroceryPriceByWeight");
            System.out.println("press 5:to getAllGroceryNameByManufactureDate");
            System.out.println("press 6:to  updatePriceByGroceryNames");
            System.out.println("press 7:to  getGroceriesByBatchNo");
            System.out.println("press 8:to  deleteGroceryByGroceryName");
            System.out.println("press 9:to  deleteGroceryByBatchNo");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    dmart.getAllGroceries();
                    break;
                case 2:
                    System.out.println("enter the name to get all groceries");
                    Grocerry grocerry = dmart.getAllGroceriesByName(sc.next());
                    System.out.println(grocerry);
                    break;
                case 3:
                    System.out.println("enter the price to get GroceryName");
                    String  name1 = dmart.getGroceryNameByPrice(sc.nextInt());
                    System.out.println(name1);
                    break;
                case 4:
                    System.out.println("enter the weight to get price");
                    int price = dmart.getGroceryPriceByWeight(sc.next());
                    System.out.println(price);
                    break;
                case 5:
                    System.out.println("enter the manufacture date to get all groceries");
                    String gro = dmart.getAllGroceryNameByManufactureDate(sc.next());
                    System.out.println(gro);
                    break;
                case 6:
                    System.out.println("enter the groceryname to update price ");
                    boolean name=dmart.updatePriceByGroceryNames(sc. nextInt(), sc.next());
                    break;


                case 7:
                    System.out.println("enter the batchno to get groceries");
                    dmart.getGroceriesByBatchNo(sc.next());
                    break;
                case 8:
                    System.out.println("enter the name to delete the groceries ");
                    dmart.deletGroceryByGroceryName(sc.next());
                    dmart.getAllGroceries();
                    break;
                case 9:
                    System.out.println("enter the batchNo to delete the groceries");
                    dmart.deleteGroceryByBatchNo(sc.next());
                    dmart.getAllGroceries();
                    break;

                default:
                    System.out.println("options are not there check it once...");
                    break;
            }
            System.out.println("do want to continue yes/no");
            str = sc.next();

        } while (str.equals("yes"));
        System.out.println("thank you....");

    }
}