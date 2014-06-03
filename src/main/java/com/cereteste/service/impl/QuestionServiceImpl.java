package com.cereteste.service.impl;

import com.cereteste.dao.AnswerDao;
import com.cereteste.dao.QuestionDao;
import com.cereteste.dao.impl.AnswerDaoImpl;
import com.cereteste.dao.impl.QuestionDaoImpl;
import com.cereteste.pojo.Answer;
import com.cereteste.pojo.Question;
import com.cereteste.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    private AnswerDao answerDao = new AnswerDaoImpl();
    private final Integer numbersQuestions = 5;

    public QuestionServiceImpl() {
        questionDao = new QuestionDaoImpl();
    }

    public void addQuestion(Question question) {
        questionDao.addOrUpdateQuestion(question);
    }

    public void updateQuestion(Question question) {
        questionDao.addOrUpdateQuestion(question);
    }

    public void delete(Question question) {
        List<Answer> list = answerDao.getAnswersQuestion(question);
        for (Answer a : list) {
            answerDao.delete(a);
        }
        questionDao.delete(question);
    }

    public Question getQuestion(int id) {
        return questionDao.getQuestion(id);
    }

    public List<Question> getQuestions() {
        return questionDao.getQuestions();
    }

    public List<Question> getRandomQuestions() {

        List<Integer> ids = randomNumbers();

        List<Question> questions = new ArrayList<Question>();

        for (int i = 0; i < numbersQuestions; i++) {
            questions.add(questionDao.getQuestion(ids.get(i)));
        }
        return questions;
    }

    private List<Integer> randomNumbers() {
        Random r = new Random();
        List<Integer> ids = new ArrayList<Integer>();
        int questionSize = questionDao.sizeList();
        int i = 0;
        while (i < numbersQuestions) {
            int aux = r.nextInt(questionSize);
            if (!ids.contains(aux)) { ids.add(aux); i++; }
        }
        return ids;
    }
}