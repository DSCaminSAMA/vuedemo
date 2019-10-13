package com.example.liu.service;

import com.example.liu.model.User;

import java.util.List;

public interface UserService {
    List<User> getUser();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int no);
}
