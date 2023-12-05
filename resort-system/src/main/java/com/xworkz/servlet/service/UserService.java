package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.CustomerDto;
import com.xworkz.servlet.dto.UserDto;

import java.util.List;

public interface UserService {
    public boolean saved(UserDto dto);
    public boolean save(CustomerDto dto);
    public List<UserDto> find();
    public UserDto getUserById(int id);
    public boolean deleteById(int id);
    public boolean updateInfoById(int id, UserDto updatedDto);
}
