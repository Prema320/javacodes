package com.xworkz.hospital;

import com.xworkz.hospital.dto.PatientDto;
import com.xworkz.hospital.system.Patient;
import com.xworkz.hospital.system.impl.PatientImpl;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Patient patient=new PatientImpl();
        PatientDto dto=new PatientDto();
//        dto.setId(sc.nextInt());
//        dto.setName(sc.next());
//        dto.setAge(sc.nextInt());
//        dto.setAddress(sc.next());
//        dto.setEmail(sc.next());
//        dto.setMobileNo(sc.nextLong());
//        patient.addAll(dto);

        List<PatientDto> list=patient.getAll();
        System.out.println(list);
        //System.out.println(patient.getPatientDtoById(sc.nextInt()));
//        System.out.println(patient.getAgeByName(sc.next()));
//        System.out.println(patient.getEmailByAge(sc.nextInt()));
//        System.out.println(patient.updatePatientDtoById( dto));
        System.out.println(patient.deletePatientDtoById(sc.nextInt()));
    }
}
