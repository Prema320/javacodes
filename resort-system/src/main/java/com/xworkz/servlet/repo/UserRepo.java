package com.xworkz.servlet.repo;

import com.xworkz.servlet.dto.CustomerDto;
import com.xworkz.servlet.dto.UserDto;

import java.util.List;

public interface UserRepo {

    public boolean add(UserDto dto);
    public boolean addAll(CustomerDto dto);

    public List<UserDto> getAll();
    public UserDto getUserById(int id);
    public boolean deleteById(int id);
    public boolean updateInfoById(int id, UserDto updatedDto);
}
