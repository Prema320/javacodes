package com.xworkz.servlet.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "resortdto")
public class CustomerDto {
    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
private String firstName;
private String lastName;
private String email;
private String  mobileNo;
private String paymentMode;
private Date checkInDate;
private Date checkOutDate;
private  String adults;
private String children;
private String rooms;

}
