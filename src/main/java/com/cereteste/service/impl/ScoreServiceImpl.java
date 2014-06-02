package com.cereteste.service.impl;

import com.cereteste.dao.ScoreDao;
import com.cereteste.dao.impl.ScoreDaoImpl;
import com.cereteste.pojo.Score;
import com.cereteste.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    public ScoreServiceImpl() {
        scoreDao = new ScoreDaoImpl();
    }

    public void addScore(Score score) {
        scoreDao.addOrUpdateScore(score);
    }

    public void updateScore(Score score) {
        scoreDao.addOrUpdateScore(score);
    }

    public Score getScore(int id) {
        return scoreDao.getScore(id);
    }

    public List<Score> getScores() {
        return scoreDao.getScores();
    }

    public List<Score> getRanking() {
        return scoreDao.getRanking();
    }
}