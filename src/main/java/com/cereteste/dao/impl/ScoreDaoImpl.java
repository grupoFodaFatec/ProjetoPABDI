package com.cereteste.dao.impl;

import com.cereteste.ConnectionFactory;
import com.cereteste.dao.ScoreDao;
import com.cereteste.pojo.Score;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
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

    public List<Score> getRanking() { //TODO
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        String hql = "select Score from Score limit order by score desc";
        return null; //session.createQuery(hql).setMaxResults(3).list();
    }
}