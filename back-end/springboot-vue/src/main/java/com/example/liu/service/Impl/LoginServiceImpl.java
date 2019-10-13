package com.example.liu.service.Impl;

import com.example.liu.mapper.LoginMapper;
import com.example.liu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String LoginIn(String username, String password) {
        return loginMapper.LoginIn(username,password);
    }
}
