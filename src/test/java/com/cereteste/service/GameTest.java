package com.cereteste.service;

import com.cereteste.pojo.Game;
import com.cereteste.service.GameService;
import com.cereteste.service.impl.GameServiceImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class GameTest {

    private GameService service = new GameServiceImpl();

    @Test
    public void testAddGame() {
        Game game = new Game();

        game.setQuestion(null);
        game.setScore(null);
        game.setAnswer("A");
        game.setTime(120);

        service.addGame(game);
    }

    @Test
    public void testUpdateGame() {
        Game game = new Game();

        game.setIdGame(1);
        game.setQuestion(null);
        game.setScore(null);
        game.setAnswer("B");
        game.setTime(120);

        service.updateGame(game);
    }

    @Test
    public void testListGame() {
        Assert.assertNotNull(service.getGame(1));
    }

    @Test
    public void testListAllGames() {
        Assert.assertNotNull(service.getGames());
    }
}