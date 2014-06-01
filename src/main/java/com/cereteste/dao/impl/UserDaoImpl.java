package com.cereteste.dao.impl;

import com.cereteste.ConnectionFactory;
import com.cereteste.dao.UserDao;
import com.cereteste.pojo.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private Session session;

    public void addOrUpdateUser(User user) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(user);
        tx.commit();
    }

    public User getUser(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (User) session.get(User.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from User").list();
    }
}