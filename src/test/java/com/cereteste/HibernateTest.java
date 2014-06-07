package com.cereteste;

import com.cereteste.service.ConnectionFactory;
import junit.framework.Assert;
import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class HibernateTest {

    @Test
    public void testConnection() {
        Session session = ConnectionFactory.getSessionFactory();
        Assert.assertNotNull(session);
    }
}