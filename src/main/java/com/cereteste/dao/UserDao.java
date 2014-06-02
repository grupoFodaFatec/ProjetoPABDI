package com.cereteste.dao;

import com.cereteste.pojo.User;

import java.util.List;

public interface UserDao {
    public void addOrUpdateUser(User user);
    public User getUser(int id);
    public List<User> getUsers();
    public User login(User user);
}