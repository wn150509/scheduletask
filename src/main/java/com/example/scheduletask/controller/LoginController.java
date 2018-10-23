package com.example.scheduletask.controller;

import com.example.scheduletask.entity.User;
import com.example.scheduletask.service.LoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/st")
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    public User getuser(String account,String password){
        return loginService.findone(account,password);
    }
    @GetMapping("/oneuser")
    public User getone(String account){
        return loginService.getOne(account);
    }
//    @GetMapping("/users")
//    public List<User>getall(){
//        return loginService.getUsers();
//    }

}
