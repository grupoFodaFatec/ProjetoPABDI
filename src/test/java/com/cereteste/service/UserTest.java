package com.cereteste.service;

import com.cereteste.pojo.User;
import com.cereteste.service.UserService;
import com.cereteste.service.impl.UserServiceImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class UserTest {

    private UserService service = new UserServiceImpl();

    @Test
    public void testAddUser() {
        User user = new User();

        user.setName("Arthur");
        user.setLogin("thur");
        user.setPassword("123");
        user.setType(1);

        service.addUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();

        user.setIdUser(1);
        user.setName("Arthur");
        user.setLogin("thur@thur.com");
        user.setPassword("123456");
        user.setType(1);

        service.updateUser(user);
    }

    @Test
    public void testListUser() {
        Assert.assertNotNull(service.getUser(1));
    }

    @Test
    public void testListAllUsers() {
        Assert.assertNotNull(service.getUsers());
    }
}