package com.cereteste.dao.impl;

import com.cereteste.dao.QuestionDao;
import com.cereteste.pojo.Question;
import com.cereteste.service.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    private Session session;

    public void addOrUpdateQuestion(Question question) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(question);
        tx.commit();
    }

    public void delete(Question question) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.delete(question);
        tx.commit();
    }

    public Question getQuestion(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Question) session.get(Question.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Question> getQuestions() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Question").list();
    }

    public int sizeList() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return ((Long) session.createQuery("select count(*) from Question").uniqueResult()).intValue();
    }
}