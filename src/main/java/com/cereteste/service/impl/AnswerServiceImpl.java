package com.cereteste.service.impl;

import com.cereteste.dao.AnswerDao;
import com.cereteste.dao.impl.AnswerDaoImpl;
import com.cereteste.pojo.Answer;
import com.cereteste.pojo.Question;
import com.cereteste.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    public AnswerServiceImpl() {
        answerDao = new AnswerDaoImpl();
    }

    public void addAnswer(Answer answer) {
        answerDao.addOrUpdateAnswer(answer);
    }

    public void updateAnswer(Answer answer) {
        answerDao.addOrUpdateAnswer(answer);
    }

    public Answer getAnswer(int id) {
        return answerDao.getAnswer(id);
    }

    public List<Answer> getAnswers() {
        return answerDao.getAnswers();
    }

    public List<Answer> getAnswersQuestion(Question question) {
        return answerDao.getAnswersQuestion(question);
    }
}