package com.xworkz.trysum.service.impl;

import com.xworkz.trysum.dto.UserDto;
import com.xworkz.trysum.repo.UserRepo;
import com.xworkz.trysum.repo.impl.UserRepoImpl;
import com.xworkz.trysum.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepo userRepo;
    public UserServiceImpl(){
        userRepo=new UserRepoImpl();
    }
    @Override
    public boolean addAll(UserDto dto) {
        boolean isValidName=false;
        boolean isValidMobileNo=false;
        boolean isValidEmail=false;
        boolean isValidAddress=false;
        if(dto!=null){
            if (dto.getName()!=null){
                isValidName=true;
            }
            if (dto.getMobileNo()>0){
                isValidMobileNo=true;
            }
            if (dto.getEmail()!=null){
                isValidEmail=true;
            }
            if (dto.getAddress()!=null){
                isValidAddress=true;
            }

        }
        if (isValidAddress && isValidEmail && isValidName && isValidMobileNo){
            userRepo.addAll(dto);
        }
        return false;
    }

    @Override
    public List<UserDto> getAll() {
        List list=userRepo.getAll();
        if (list!=null){
            System.out.println("not null");
        }

        return list;
    }

    @Override
    public UserDto getUserDtoById(int id) {
        return userRepo.getUserDtoById(id);
    }

    @Override
    public String getNameByEmail(String email) {
        return userRepo.getNameByEmail(email);
    }

    @Override
    public boolean updateEmailById(String updatedEmail, int id) {

if (id>0 && updatedEmail!=null) {
    userRepo.updateEmailById(updatedEmail, id);
}

        return false;
    }

    @Override
    public UserDto updateUserDtoById(int id,UserDto dto) {

        return userRepo.updateUserDtoById(id,dto);
    }

    @Override
    public void deleteUserDtoById(int id) {
        if (id>0){
            userRepo.deleteUserDtoById(id);
        }

    }
}
