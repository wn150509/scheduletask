package com.example.scheduletask.dao;

import com.example.scheduletask.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoginRepository extends JpaRepository<User,Integer> {
    User findByAccountAndPassword(String account,String password);
    User findByAccount(String account);
//    @Query("select u from User u order by u.count desc ")
//    List<User>getUsers();
}
