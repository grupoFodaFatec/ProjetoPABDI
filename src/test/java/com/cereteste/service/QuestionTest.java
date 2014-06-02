package com.cereteste.service;

import com.cereteste.pojo.Question;
import com.cereteste.service.impl.QuestionServiceImpl;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")

public class QuestionTest {

    private QuestionService service = new QuestionServiceImpl();

    @Test
    public void testAddQuestion() {
        Question question = new Question();

        question.setQuestion("Question");
        question.setType(1);

        service.addQuestion(question);
    }

    @Test
    public void testUpdateQuestion() {
        Question question = new Question();

        question.setIdQuestion(1);
        question.setQuestion("Question");
        question.setType(1);

        service.updateQuestion(question);
    }

    @Test
    public void testListQuestion() {
        Assert.assertNotNull(service.getQuestion(1));
    }

    @Test
    public void testListAllQuestions() {
        Assert.assertNotNull(service.getQuestions());
    }

    @Test
    public void testRandomQuestions() {
        List<Question> l = service.getRandomQuestions();
        for (Question i: l) {
            System.out.println("Question id: " + i.getIdQuestion());
            System.out.println("Question: " + i.getQuestion());
        }
    }
}