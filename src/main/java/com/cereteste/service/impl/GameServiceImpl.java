package com.cereteste.service.impl;

import com.cereteste.dao.GameDao;
import com.cereteste.dao.impl.GameDaoImpl;
import com.cereteste.pojo.Game;
import com.cereteste.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    public GameServiceImpl() {
        gameDao = new GameDaoImpl();
    }

    public void addGame(Game game) {
        gameDao.addOrUpdateGame(game);
    }

    public void updateGame(Game game) {
        gameDao.addOrUpdateGame(game);
    }

    public Game getGame(int id) {
        return gameDao.getGame(id);
    }

    public List<Game> getGames() {
        return gameDao.getGames();
    }
}