package com.cereteste.service;

import com.cereteste.pojo.Game;

import java.util.List;

public interface GameService {
    public void addGame(Game game);
    public void updateGame(Game game);
    public Game getGame(int id);
    public List<Game> getGames();
}