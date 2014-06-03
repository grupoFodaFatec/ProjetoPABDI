package com.cereteste.pojo;

import com.cereteste.service.impl.AnswerServiceImpl;

import java.util.List;

/**
 * Created by glaucia on 03/06/14.
 */
public class FakeQuestion {

    private Integer fakeid;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerE;
    private Integer fakeidA;
    private Integer fakeidB;
    private Integer fakeidC;
    private Integer fakeidD;
    private Integer fakeidE;
    private Integer type;
    private Boolean isCorrectAnswerA;
    private Boolean isCorrectAnswerB;
    private Boolean isCorrectAnswerC;
    private Boolean isCorrectAnswerD;
    private Boolean isCorrectAnswerE;

    public FakeQuestion() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getAnswerE() {
        return answerE;
    }

    public void setAnswerE(String answerE) {
        this.answerE = answerE;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getIsCorrectAnswerA() {
        if (isCorrectAnswerA == null) return false;
        return isCorrectAnswerA;
    }

    public void setIsCorrectAnswerA(Boolean isCorrectAnswerA) {
        this.isCorrectAnswerA = isCorrectAnswerA;
    }

    public Boolean getIsCorrectAnswerB() {
        if (isCorrectAnswerB == null) return false;
        return isCorrectAnswerB;
    }

    public void setIsCorrectAnswerB(Boolean isCorrectAnswerB) {

        this.isCorrectAnswerB = isCorrectAnswerB;
    }

    public Boolean getIsCorrectAnswerC() {
        if (isCorrectAnswerC == null) return false;
        return isCorrectAnswerC;
    }

    public void setIsCorrectAnswerC(Boolean isCorrectAnswerC) {
        this.isCorrectAnswerC = isCorrectAnswerC;
    }

    public Boolean getIsCorrectAnswerD() {
        if (isCorrectAnswerC == null) return false;
        return isCorrectAnswerD;
    }

    public void setIsCorrectAnswerD(Boolean isCorrectAnswerD) {
        this.isCorrectAnswerD = isCorrectAnswerD;
    }

    public Boolean getIsCorrectAnswerE() {
        if (isCorrectAnswerE == null) return false;
        return isCorrectAnswerE;
    }

    public void setIsCorrectAnswerE(Boolean isCorrectAnswerE) {
        this.isCorrectAnswerE = isCorrectAnswerE;
    }

    public Integer getFakeid() {
        return fakeid;
    }

    public void setFakeid(Integer fakeid) {
        this.fakeid = fakeid;
    }

    public Integer getFakeidA() {
        return fakeidA;
    }

    public void setFakeidA(Integer fakeidA) {
        this.fakeidA = fakeidA;
    }

    public Integer getFakeidB() {
        return fakeidB;
    }

    public void setFakeidB(Integer fakeidB) {
        this.fakeidB = fakeidB;
    }

    public Integer getFakeidC() {
        return fakeidC;
    }

    public void setFakeidC(Integer fakeidC) {
        this.fakeidC = fakeidC;
    }

    public Integer getFakeidD() {
        return fakeidD;
    }

    public void setFakeidD(Integer fakeidD) {
        this.fakeidD = fakeidD;
    }

    public Integer getFakeidE() {
        return fakeidE;
    }

    public void setFakeidE(Integer fakeidE) {
        this.fakeidE = fakeidE;
    }

    public Question createQuestion() {
        Question question1 = new Question();
        question1.setType(this.type);
        question1.setQuestion(this.question);
        if (fakeid != null) question1.setIdQuestion(this.fakeid);
        return question1;
    }

    public Answer createAnswerA() {
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerA);
        answer1.setAnswer(this.answerA);
        if (fakeidA != null) answer1.setIdAnswer(this.fakeidA);
        return answer1;
    }

    public Answer createAnswerB() {
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerB);
        answer1.setAnswer(this.answerB);
        if (fakeidB != null) answer1.setIdAnswer(this.fakeidB);
        return answer1;
    }

    public Answer createAnswerC() {
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerC);
        answer1.setAnswer(this.answerC);
        if (fakeidC != null) answer1.setIdAnswer(this.fakeidC);
        return answer1;
    }

    public Answer createAnswerD() {
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerD);
        answer1.setAnswer(this.answerD);
        if (fakeidD != null) answer1.setIdAnswer(this.fakeidD);
        return answer1;
    }

    public Answer createAnswerE() {
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerE);
        answer1.setAnswer(this.answerE);
        if (fakeidE != null) answer1.setIdAnswer(this.fakeidE);
        return answer1;
    }

    public FakeQuestion createFakeQuestion(Question question1) {
        this.question = question1.getQuestion();
        this.type = question1.getType();
        this.fakeid = question1.getIdQuestion();

        AnswerServiceImpl service = new AnswerServiceImpl();

        List<Answer> answer = service.getAnswersQuestion(question1);

        this.fakeidA = answer.get(0).getIdAnswer();
        this.answerA = answer.get(0).getAnswer();
        this.isCorrectAnswerA = answer.get(0).getCorrect();


        this.fakeidB = answer.get(1).getIdAnswer();
        this.answerB = answer.get(1).getAnswer();
        this.isCorrectAnswerB = answer.get(1).getCorrect();


        this.fakeidC = answer.get(2).getIdAnswer();
        this.answerC = answer.get(2).getAnswer();
        this.isCorrectAnswerC = answer.get(2).getCorrect();


        this.fakeidD = answer.get(3).getIdAnswer();
        this.answerD = answer.get(3).getAnswer();
        this.isCorrectAnswerD = answer.get(3).getCorrect();


        this.fakeidE = answer.get(4).getIdAnswer();
        this.answerE = answer.get(4).getAnswer();
        this.isCorrectAnswerE = answer.get(4).getCorrect();

        return this;
    }

}
