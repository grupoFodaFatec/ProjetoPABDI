package com.cereteste.service;

import com.cereteste.pojo.Answer;

import java.util.List;

public interface AnswerService {
    public void addAnswer(Answer user);
    public void updateAnswer(Answer user);
    public Answer getAnswer(int id);
    public List<Answer> getAnswers();
}