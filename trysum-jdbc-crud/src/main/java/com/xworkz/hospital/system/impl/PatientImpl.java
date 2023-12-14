package com.xworkz.hospital.system.impl;

import com.xworkz.hospital.dto.PatientDto;
import com.xworkz.hospital.system.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PatientImpl implements Patient {
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet res=null;
    @Override
    public boolean addAll(PatientDto dto) {
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("insert into patient values(?,?,?,?,?,?)");
            stmt.setInt(1,dto.getId());
            stmt.setString(2,dto.getName());
            stmt.setInt(3,dto.getAge());
            stmt.setString(4,dto.getAddress());
            stmt.setString(5,dto.getEmail());
            stmt.setLong(6,dto.getMobileNo());
            stmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<PatientDto> getAll() {
        List<PatientDto> list=new ArrayList<>();
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("select * from patient");
            res=stmt.executeQuery();
            while (res.next()){
                PatientDto dto=new PatientDto();
                dto.setId(res.getInt(1));
                dto.setName(res.getString(2));
                dto.setAge(res.getInt(3));
                dto.setAddress(res.getString(4));
                dto.setEmail(res.getString(5));
                dto.setMobileNo(res.getLong(6));
                list.add(dto);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public PatientDto getPatientDtoById(int id) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("select * from patient where id=?");
            stmt.setInt(1,id);
            res=stmt.executeQuery();
            while (res.next()){
                String name=res.getString("name");
                String email=res.getString("email");
                int age= res.getInt("age");
                String  address=res.getString("address");
                long mobile=res.getLong("mobileno");
                System.out.println(name);
                System.out.println(email);
                System.out.println(address);
                System.out.println(age);
                System.out.println(mobile);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getAgeByName(String name) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("select age from patient where name=?");
            stmt.setString(1,name);
            res=stmt.executeQuery();
            while (res.next()){
                int age= res.getInt("age");
                System.out.println(age);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public int getEmailByAge(int age) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("select email from patient where age=?");
            stmt.setInt(1,age);
            res=stmt.executeQuery();
            while (res.next()){
                String email=res.getString("email");
                System.out.println(email);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public boolean updatePatientDtoById(PatientDto dto) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("update patient set name=?,email=?,age=?,address=?,mobileno=? where id=? ");
            stmt.setInt(1,dto.getId());
            stmt.setString(2,dto.getName());
            stmt.setInt(3,dto.getAge());
            stmt.setString(4,dto.getAddress());
            stmt.setString(5,dto.getEmail());
            stmt.setLong(6,dto.getMobileNo());

            stmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateAgeByName(int updatedAge, String name) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("update patient set age=? where name=?");
            stmt.setString(1,name);
            stmt.setInt(2,updatedAge);
            stmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }



    @Override
    public boolean deletePatientDtoById(int id) {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpatient","root","root");
            stmt=con.prepareStatement("delete from patient where id=?");
            stmt.setInt(1,id);
            stmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
