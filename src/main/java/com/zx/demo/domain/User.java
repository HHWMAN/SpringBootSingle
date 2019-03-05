package com.zx.demo.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table(name="t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //mysql专有自增方式
    @Column(name = "t_id")
    private Long id;

    @Size(min = 2)
    @Column(name = "t_name")
    private String name;

    @Min(value = 18,message = "必须是成年人")
    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    private Date birthday;

}

