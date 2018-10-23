package com.example.scheduletask.dao;

import com.example.scheduletask.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginRepositoryTest {

    @Resource
    private LoginRepository loginRepository;
    @Test
    public void findByAccountAndPassword() throws Exception {
        System.out.println(loginRepository.findByAccountAndPassword("1","wangning"));
    }
//    @Test
//    public void getUsers() throws Exception {
//        List<User>userList=loginRepository.getUsers();
//        userList.forEach(user -> System.out.println(user));
//    }

}