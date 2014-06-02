package com.cereteste.dao;

import com.cereteste.pojo.Score;

import java.util.List;

public interface ScoreDao {
    public void addOrUpdateScore(Score score);
    public Score getScore(int id);
    public List<Score> getScores();
    public List<Score> getRanking();
}