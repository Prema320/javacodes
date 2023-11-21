package com.xworkz.airpods.service.impl;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repository.AirpodsRepository;
import com.xworkz.airpods.repository.impl.AirpodsRepositoryImpl;
import com.xworkz.airpods.service.AirpodsService;

import java.util.List;

public class AirpodsServiceImpl implements AirpodsService {
    AirpodsRepository repo=new AirpodsRepositoryImpl();
    @Override
    public boolean store(AirpodsDto dto) {

        System.out.println("start");
        if(dto!=null) {
            if(!(dto.getId()>0 && dto.getPrice()<2000)) {
                return repo.store(dto);

            }
            System.out.println("end");
        }
        return false;
    }

    @Override
    public List<AirpodsDto> readAll() {

        return repo.readAll();
    }

    @Override
    public boolean updateColorByName(String color, String name) {
        if(color!=null && name!= null) {
            System.out.println("data for updation is valid");
            return repo.updateColorByName(color,name);
        }
        return false;
    }

    @Override
    public boolean deleteByPrice(int price) {
        if(price>10) {
            System.out.println("price valid");
            return repo.deleteByPrice(price);
        }
        return false;
    }
}
