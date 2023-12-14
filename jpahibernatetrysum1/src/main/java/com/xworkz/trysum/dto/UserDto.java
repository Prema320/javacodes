package com.xworkz.trysum.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
@NamedQueries(value = {


        @NamedQuery(name = "getAll", query = "from UserDto dto"),
        @NamedQuery(name = "getUserDtoById",query = "select dto from UserDto dto where dto.id=:ids"),
        @NamedQuery(name = "getNameByEmail",query = "select name from UserDto dto where dto.email=:email"),
        @NamedQuery(name = "updateEmailById",query = "update UserDto d set d.email=:mail where d.id=:idq"),
        @NamedQuery(name = "deleteUserDtoById",query = "delete from UserDto dto where dto.id=:id")
})
public class UserDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")
    private int id;
    private String name;
    private long mobileNo;
    private  String  email;
    private String address;
}
