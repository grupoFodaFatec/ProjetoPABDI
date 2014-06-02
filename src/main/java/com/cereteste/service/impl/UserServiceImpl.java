package com.cereteste.service.impl;

import com.cereteste.dao.UserDao;
import com.cereteste.dao.impl.UserDaoImpl;
import com.cereteste.pojo.User;
import com.cereteste.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public void addUser(User user) {
        userDao.addOrUpdateUser(user);
    }

    public void updateUser(User user) {
        userDao.addOrUpdateUser(user);
    }

    public User getUser(int id) {
        return userDao.getUser(id);
    }

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public User login(User user) {
        return userDao.login(user);
    }
}