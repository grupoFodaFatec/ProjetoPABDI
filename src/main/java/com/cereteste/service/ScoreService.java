package com.cereteste.service;

import com.cereteste.pojo.Score;

import java.util.List;

public interface ScoreService {
    public void addScore(Score score);
    public void updateScore(Score score);
    public Score getScore(int id);
    public List<Score> getScores();
}