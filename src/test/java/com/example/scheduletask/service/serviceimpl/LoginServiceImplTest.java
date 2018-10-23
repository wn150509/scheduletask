package com.example.scheduletask.service.serviceimpl;

import com.example.scheduletask.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {
    @Resource
    private LoginService loginService;
    @Test
    public void findone() throws Exception {
        System.out.println(loginService.findone("wangning","wangning"));
    }

}