package com.cereteste.service.impl;

import com.cereteste.dao.QuestionDao;
import com.cereteste.dao.impl.QuestionDaoImpl;
import com.cereteste.pojo.Question;
import com.cereteste.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public QuestionServiceImpl() {
        questionDao = new QuestionDaoImpl();
    }

    public void addQuestion(Question question) {
        questionDao.addOrUpdateQuestion(question);
    }

    public void updateQuestion(Question question) {
        questionDao.addOrUpdateQuestion(question);
    }

    public Question getQuestion(int id) {
        return questionDao.getQuestion(id);
    }

    public List<Question> getQuestions() {
        return questionDao.getQuestions();
    }
}