package com.cereteste.pojo;

/**
 * Created by glaucia on 03/06/14.
 */
public class FakeQuestion {

    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerE;
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
        if(isCorrectAnswerA == null)return false;
        return isCorrectAnswerA;
    }

    public void setIsCorrectAnswerA(Boolean isCorrectAnswerA) {
        this.isCorrectAnswerA = isCorrectAnswerA;
    }

    public Boolean getIsCorrectAnswerB() {
        if(isCorrectAnswerB == null)return false;
        return isCorrectAnswerB;
    }

    public void setIsCorrectAnswerB(Boolean isCorrectAnswerB) {
        this.isCorrectAnswerB = isCorrectAnswerB;
    }

    public Boolean getIsCorrectAnswerC() {
        if(isCorrectAnswerC == null)return false;
        return isCorrectAnswerC;
    }

    public void setIsCorrectAnswerC(Boolean isCorrectAnswerC) {
        this.isCorrectAnswerC = isCorrectAnswerC;
    }

    public Boolean getIsCorrectAnswerD() {
        if(isCorrectAnswerC == null)return false;
        return isCorrectAnswerD;
    }

    public void setIsCorrectAnswerD(Boolean isCorrectAnswerD) {
        this.isCorrectAnswerD = isCorrectAnswerD;
    }

    public Boolean getIsCorrectAnswerE() {
        if(isCorrectAnswerE == null)return false;
        return isCorrectAnswerE;
    }

    public void setIsCorrectAnswerE(Boolean isCorrectAnswerE) {
        this.isCorrectAnswerE = isCorrectAnswerE;
    }

    public Question createQuestion(){
        Question question1 = new Question();
        question1.setQuestion(this.question);
        return question1;
    }

    public Answer createAnswerA(){
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerA);
        answer1.setAnswer(this.answerA);
        return answer1;
    }

    public Answer createAnswerB(){
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerB);
        answer1.setAnswer(this.answerB);
        return answer1;
    }

    public Answer createAnswerC(){
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerC);
        answer1.setAnswer(this.answerC);
        return answer1;
    }

    public Answer createAnswerD(){
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerD);
        answer1.setAnswer(this.answerD);
        return answer1;
    }

    public Answer createAnswerE(){
        Answer answer1 = new Answer();
        answer1.setCorrect(this.isCorrectAnswerE);
        answer1.setAnswer(this.answerE);
        return answer1;
    }

}
