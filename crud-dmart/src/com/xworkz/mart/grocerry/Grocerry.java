package com.xworkz.mart.grocerry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Grocerry {
    private int id;
    private  String groceryName;
    private int price;
    private String manufactureDate;
    private String expiredDate;
    private  String weight;
    private String batchNo;

}
