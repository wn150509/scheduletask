package com.example.scheduletask.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String account;
    private String password;
    private String avatar;
    private String bgpic;
}
