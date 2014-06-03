package com.cereteste.dao.impl;

import com.cereteste.ConnectionFactory;
import com.cereteste.dao.AnswerDao;
import com.cereteste.pojo.Answer;
import com.cereteste.pojo.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswerDaoImpl implements AnswerDao {

    private Session session;

    public void addOrUpdateAnswer(Answer answer) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(answer);
        tx.commit();
    }

    public Answer getAnswer(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Answer) session.get(Answer.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Answer> getAnswers() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Answer").list();
    }

    @SuppressWarnings("unchecked")
    public List<Answer> getAnswersQuestion(Question question) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Answer where question = :question")
                .setParameter("question", question)
                .list();
    }

    @SuppressWarnings("unchecked")
    public Answer getRight(Question question) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Answer) session.createQuery("from Answer where question = :question " +
                "and correct = 1")
                .setParameter("question", question)
                .list()
                .get(0);
    }
}