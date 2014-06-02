package com.cereteste.dao;

import com.cereteste.pojo.Question;

import java.util.List;

public interface QuestionDao {
    public void addOrUpdateQuestion(Question question);
    public Question getQuestion(int id);
    public List<Question> getQuestions();
    public int sizeList();
}