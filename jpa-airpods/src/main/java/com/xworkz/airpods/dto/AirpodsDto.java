package com.xworkz.airpods.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Table(name = "airpods")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "deleteByPrice" , query = "Delete from AirpodsDto dto where dto.price=:pr")
@NamedQuery(name = "updateColorbyName", query = "Update AirpodsDto dto set dto.color=:col where dto.brandName=:nm")
@NamedQuery(name = "select",query = "select  dto from AirpodsDto dto")


public class AirpodsDto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
        private int id;
@Column(name = "brandName")
        private String brandName;
@Column(name = "price")
        private int price;
@Column(name = "color")
        private String color;
@Column(name = "batteryBackup")
        private int batteryBackup;



}
