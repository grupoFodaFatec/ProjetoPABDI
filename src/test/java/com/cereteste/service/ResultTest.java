package com.cereteste.service;

import com.cereteste.pojo.Result;
import com.cereteste.service.impl.ResultServiceImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class ResultTest {

    private ResultService service = new ResultServiceImpl();

    @Test
    public void testAddResult() {
        Result result = new Result();

        result.setUser(null);
        result.setScore(null);

        service.addResult(result);
    }

    @Test
    public void testUpdateResult() {
        Result result = new Result();

        result.setIdResult(1);
        result.setUser(null);
        result.setScore(null);

        service.updateResult(result);
    }

    @Test
    public void testListResult() {
        Assert.assertNotNull(service.getResult(1));
    }

    @Test
    public void testListAllResults() {
        Assert.assertNotNull(service.getResults());
    }
}