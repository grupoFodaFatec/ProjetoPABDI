package com.cereteste.service;

import com.cereteste.pojo.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public User getUser(int id);
    public List<User> getUsers();
}