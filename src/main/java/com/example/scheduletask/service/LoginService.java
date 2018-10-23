package com.example.scheduletask.service;

import com.example.scheduletask.entity.User;

import java.util.List;

public interface LoginService {
    User findone(String account,String password);
    User getOne(String account);
//    List<User>getUsers();
}
