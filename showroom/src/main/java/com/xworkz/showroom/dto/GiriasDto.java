package com.xworkz.showroom.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@Builder
@Entity
@Table(name="girias_showroom")
public class GiriasDto {
    @Id
    @GenericGenerator(name="ref",strategy = "increment")
    @GeneratedValue(generator ="ref")
    @Column(name="id")
    private int id;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "price")
    private  int price;
    @Column(name = "color")
    private String color;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "size")
    private String size;

}
