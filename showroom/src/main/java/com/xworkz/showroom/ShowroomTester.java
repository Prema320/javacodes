package com.xworkz.showroom;

import com.xworkz.showroom.dto.GiriasDto;
import com.xworkz.showroom.impl.ShowroomImpl;
import com.xworkz.showroom.inter.Showroom;

import java.util.Scanner;

public class ShowroomTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        Showroom showroom =new ShowroomImpl();
        for (int i=0;i<size;i++){
            GiriasDto dto1= new GiriasDto();
            dto1.setColor(sc.next());
            dto1.setBrandName(sc.next());
            dto1.setItemName(sc.next());
            dto1.setPrice(sc.nextInt());
            dto1.setSize(sc.next());

            showroom.addAllDetails(dto1);

        }

    }
}
