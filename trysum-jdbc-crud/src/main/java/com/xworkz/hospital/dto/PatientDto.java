package com.xworkz.hospital.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientDto {
    private int id;
    private String name;
    private int age;
    private String address;
    private String  email;
    private long mobileNo;
}
