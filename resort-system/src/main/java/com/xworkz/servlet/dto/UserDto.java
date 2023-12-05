package com.xworkz.servlet.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
@NamedQueries(value = {

        @NamedQuery(name = "getById", query = "select dto from UserDto dto where dto.id=:id"),
//       @NamedQuery(name = "update", query = "update UserDto  dto set dto.userName=:nm where dto.id=:userid"),
        @NamedQuery(name = "deleteById", query = "DELETE FROM UserDto dto WHERE dto.id = :ids"),
        @NamedQuery(name = "get",query = "select dto from UserDto as dto")


})



public class UserDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    private int id;

    private String name;

    private String email;

    private String mobileNo;

    private String comments;
}

