package com.example.liu.controller;

import com.example.liu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login", method = {RequestMethod.POST})
    public Boolean LoginIn(HttpServletRequest request, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.printf("您的用户名是："+username);
        System.out.printf("您的密码是："+password);
        String tname = loginService.LoginIn(username,password);
        session.setAttribute("tname",tname);
        if (tname == null){
            return false;
        }else {
            return true;
        }
    }

}
