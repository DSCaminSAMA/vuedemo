package com.example.liu.service.Impl;

import com.example.liu.mapper.UserMapper;
import com.example.liu.model.User;
import com.example.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser() {
        List<User> list = userMapper.getUser();
        Collections.sort(list,(user1,user2) -> user1.getNo()-user2.getNo());
        return list;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user.getName(),user.getEmail(),user.getNo());
    }

    @Override
    public void deleteUser(int no) {
        userMapper.deleteUser(no);
    }
}
