package com.xworkz.trysum.repo;

import com.xworkz.trysum.dto.UserDto;

import java.util.List;

public interface UserRepo {
    public boolean addAll(UserDto dto);
    public List<UserDto> getAll();
    public UserDto getUserDtoById(int id);
    public String getNameByEmail(String email);
    public void updateEmailById(String  updatedEmail,int id);
    public UserDto updateUserDtoById(int id,UserDto dto);
    public void deleteUserDtoById(int id);
}
