package com.cereteste.service;

import com.cereteste.pojo.Score;
import com.cereteste.service.impl.ScoreServiceImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class ScoreTest {
//teste
    private ScoreService service = new ScoreServiceImpl();

    @Test
    public void testAddScore() {
        Score score = new Score();

        score.setScore(1209);
        score.setDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        service.addScore(score);
    }

    @Test
    public void testUpdateScore() {
        Score score = new Score();

        score.setIdScore(1);
        score.setScore(1209);
        score.setDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        service.updateScore(score);

    }

    @Test
    public void testListScore() {
        Assert.assertNotNull(service.getScore(1));
    }

    @Test
    public void testListAllScores() {
        Assert.assertNotNull(service.getScores());
    }
}