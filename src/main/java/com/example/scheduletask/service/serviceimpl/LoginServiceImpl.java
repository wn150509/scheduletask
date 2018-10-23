package com.example.scheduletask.service.serviceimpl;

import com.example.scheduletask.dao.LoginRepository;
import com.example.scheduletask.entity.User;
import com.example.scheduletask.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;
    @Override
    public User findone(String account, String password) {
        return loginRepository.findByAccountAndPassword(account,password);
    }

    @Override
    public User getOne(String account) {
        return loginRepository.findByAccount(account);
    }

//    @Override
//    public List<User> getUsers() {
//        return loginRepository.getUsers();
//    }
}
