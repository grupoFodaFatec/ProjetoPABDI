package com.cereteste.dao.impl;

import com.cereteste.dao.ScoreDao;
import com.cereteste.pojo.Score;
import com.cereteste.service.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScoreDaoImpl implements ScoreDao {

    private Session session;

    public void addOrUpdateScore(Score score) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(score);
        tx.commit();
    }

    public Score getScore(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Score) session.get(Score.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Score> getScores() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Score").list();
    }

    @SuppressWarnings("unchecked")
    public List<Score> getRanking() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Score order by score desc").setMaxResults(3).list();
    }
}