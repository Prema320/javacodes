package com.xworkz.servlet.service.impl;

import com.xworkz.servlet.dto.CustomerDto;
import com.xworkz.servlet.dto.UserDto;
import com.xworkz.servlet.repo.UserRepo;
import com.xworkz.servlet.repo.impl.UserRepoImpl;
import com.xworkz.servlet.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    public UserServiceImpl() {

        userRepo = new UserRepoImpl();
    }

    @Override
    public boolean saved(UserDto dto) {
        boolean isValidName = false;
        boolean isValidEmail = false;
        boolean isValidMobileNumber = false;
        boolean isValidComments = false;
        if (dto != null) {
            if (dto.getName() != null) {
                isValidName = true;
            }
            if (dto.getEmail() != null) {
                isValidEmail = true;
            }
            if (dto.getMobileNo() != null) {
                isValidMobileNumber = true;
            }
            if (dto.getComments() != null) {
                isValidComments = true;
            }
            if (isValidName && isValidEmail && isValidMobileNumber && isValidComments) {
                userRepo.add(dto);
            }

        }
        return false;
    }

    @Override
    public boolean save(CustomerDto dto) {
        boolean isValidFirstName=false;
        boolean isValidLastName=false;
        boolean isValidEmail=false;
        boolean isValidMobileNo=false;
        boolean isValidPayment=false;
        boolean isValidCheckIn=false;
        boolean isValidCheckOut=false;
        boolean isValidAdults=false;
        boolean isValidChild=false;
        boolean isValidRooms=false;
        if (dto!=null){
            if (dto.getFirstName()!=null){
                isValidFirstName=true;
            }
            if (dto.getLastName()!=null){
                isValidLastName=true;
            }
            if (dto.getEmail()!=null){
                isValidEmail=true;
            }
            if (dto.getMobileNo()!=null){
                isValidMobileNo=true;
            }
            if (dto.getPaymentMode()!=null){
            isValidPayment=true;
            }
            if (dto.getCheckInDate()!=null){
                isValidCheckIn=true;
            }
            if (dto.getCheckOutDate()!=null){
                isValidCheckOut=true;
            }
            if (dto.getAdults()!=null){
                isValidAdults=true;
            }
            if(dto.getChildren()!=null){
                isValidChild=true;
            }
            if (dto.getRooms()!=null){
                isValidRooms=true;
            }
            if (isValidAdults && isValidCheckIn && isValidCheckOut && isValidChild && isValidEmail && isValidFirstName && isValidLastName && isValidMobileNo && isValidPayment && isValidRooms){
             userRepo.addAll(dto);
            }

        }
        return false;
    }

    @Override
    public List<UserDto> find() {
        List list=userRepo.getAll();
        if (list!=null){
            System.out.println("list is not null");
        }
        return list;
    }

    @Override
    public UserDto getUserById(int id) {

          return   userRepo.getUserById(id);

    }

    @Override
    public boolean deleteById(int id) {
        if (id>0){
            userRepo.deleteById(id);
        }
        return false;
    }

    @Override
    public boolean updateInfoById(int id, UserDto updatedDto) {
        if (id>0){
            userRepo.updateInfoById(id, updatedDto);
        }

        return false;
    }
}