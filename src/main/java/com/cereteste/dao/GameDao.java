package com.cereteste.dao;

import com.cereteste.pojo.Game;

import java.util.List;

public interface GameDao {
    public void addOrUpdateGame(Game game);
    public Game getGame(int id);
    public List<Game> getGames();
}