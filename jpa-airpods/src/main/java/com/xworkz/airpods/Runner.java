package com.xworkz.airpods;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.impl.AirpodsServiceImpl;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        AirpodsService service = new AirpodsServiceImpl();

//        AirpodsDto dto = new AirpodsDto(3,"OnePlus", 50000 , "white" , 15);
//        AirpodsDto dto1=new AirpodsDto(2,"redmi",200000,"black",20);
        // service.store(dto1);
        //service.store(dto);

        //service.updateColorByName("black", "OnePlus");
//
//
//      service.deleteByPrice(50000);
        List<AirpodsDto> list = service.readAll();
        for (AirpodsDto a:list){
            System.out.println(a.toString());


        }

    }
}
