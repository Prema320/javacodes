package com.xworkz.trysum;

import com.xworkz.trysum.dto.UserDto;
import com.xworkz.trysum.service.UserService;
import com.xworkz.trysum.service.impl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        UserService service=new UserServiceImpl();
        UserDto dto=new UserDto();
        Scanner sc=new Scanner(System.in);
//        dto.setName(sc.next());
//        dto.setMobileNo(sc.nextLong());
//        dto.setEmail(sc.next());
//        dto.setAddress(sc.next());
//        service.addAll(dto);
        List<UserDto> list=service.getAll();
        System.out.println(list);
        //.out.println(service.getUserDtoById(sc.nextInt()));
        //System.out.println(service.getNameByEmail(sc.next()));
       // System.out.println(service.updateEmailById(sc.next(),sc.nextInt()));
//        System.out.println(service.updateUserDtoById(1,dto));
        service.deleteUserDtoById(sc.nextInt());
    }
}
