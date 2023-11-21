package com.xworkz.airpods.repository;

import com.xworkz.airpods.dto.AirpodsDto;

import java.util.List;

public interface AirpodsRepository {
    public boolean store(AirpodsDto dto);

    public boolean updateColorByName(String color, String name);

    public boolean deleteByPrice(int price);

    public List<AirpodsDto> readAll();

}
