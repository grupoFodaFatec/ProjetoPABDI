package com.cereteste.dao;

import com.cereteste.pojo.Answer;

import java.util.List;

public interface AnswerDao {
    public void addOrUpdateAnswer(Answer answer);
    public Answer getAnswer(int id);
    public List<Answer> getAnswers();
}