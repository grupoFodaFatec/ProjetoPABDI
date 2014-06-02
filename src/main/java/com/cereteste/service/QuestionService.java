package com.cereteste.service;

import com.cereteste.pojo.Question;

import java.util.List;

public interface QuestionService {
    public void addQuestion(Question question);
    public void updateQuestion(Question question);
    public Question getQuestion(int id);
    public List<Question> getQuestions();
    public List<Question> getRandomQuestions();
}