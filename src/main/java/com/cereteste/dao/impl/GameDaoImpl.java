package com.cereteste.dao.impl;

import com.cereteste.dao.GameDao;
import com.cereteste.pojo.Game;
import com.cereteste.service.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameDaoImpl implements GameDao {

    private Session session;

    public void addOrUpdateGame(Game game) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(game);
        tx.commit();
    }

    public Game getGame(int id) {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return (Game) session.get(Game.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Game> getGames() {
        session = ConnectionFactory.getSessionFactory();
        Transaction tx = session.beginTransaction();
        return session.createQuery("from Game").list();
    }
}