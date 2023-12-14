package com.xworkz.hospital.system;

import com.xworkz.hospital.dto.PatientDto;

import java.util.List;

public interface Patient {
    public boolean addAll(PatientDto dto);
    public List<PatientDto> getAll();
    public  PatientDto getPatientDtoById(int id);
    public String getAgeByName(String name);
    public int getEmailByAge(int age);
    public  boolean updatePatientDtoById(PatientDto dto);
    public  boolean updateAgeByName(int updatedAge,String name);

    public boolean deletePatientDtoById(int id);

}
