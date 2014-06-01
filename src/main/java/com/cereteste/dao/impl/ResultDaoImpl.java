package com.cereteste.dao.impl;

import com.cereteste.ConnectionFactory;
import com.cereteste.dao.ResultDao;
import com.cereteste.pojo.Result;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResultDaoImpl implements ResultDao {

    private Session session;

    public void addOrUpdateResult(Result result) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(result);
        tx.commit();
    }

    public Result getResult(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Result) session.get(Result.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Result> getResults() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Result").list();
    }
}