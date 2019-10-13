package com.example.liu.controller;

import com.example.liu.model.User;
import com.example.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    //查询用户
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> getUser(){
        return userService.getUser();
    }

    //新增用户
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void addUser(User user){
        userService.addUser(user);
    }

    //更新用户
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void updateUser(User user){
        userService.updateUser(user);
    }

    //删除用户
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam(value = "no")int no){
        userService.deleteUser(no);
    }

}
