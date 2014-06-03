package com.cereteste.service;

import com.cereteste.pojo.Answer;
import com.cereteste.service.AnswerService;
import com.cereteste.service.impl.AnswerServiceImpl;
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

public class AnswerTest {

    private AnswerService service = new AnswerServiceImpl();

    @Test
    public void testAddAnswer() {
        Answer answer = new Answer();

        answer.setQuestion(null);
        answer.setAnswer("Answer A");
        answer.setCorrect(true);

        service.addAnswer(answer);
    }

    @Test
    public void testUpdateAnswer() {
        Answer answer = new Answer();

        answer.setIdAnswer(1);
        answer.setQuestion(null);
        answer.setAnswer("Answer B");
        answer.setCorrect(true);

        service.updateAnswer(answer);
    }

    @Test
    public void testListAnswer() {
        Assert.assertNotNull(service.getAnswer(1));
    }

    @Test
    public void testListAllAnswers() {
        Assert.assertNotNull(service.getAnswers());
    }

    @Test
    public void testAnswersQuestion() {
        QuestionService q = new QuestionServiceImpl();
        List<Answer> l = service.getAnswersQuestion(q.getQuestion(1));
        for (Answer i: l) System.out.println(i.getAnswer());
    }
}