package com.cereteste.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "idAnswer", nullable = false, insertable = true, updatable = true, columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    private int idAnswer;

    @Column(name = "answer", nullable = true, insertable = true, updatable = true, length = 45)
    private String answer;

    @Column(name = "correct", insertable = true, updatable = true)
    private Integer correct;

    @ManyToOne
    @JoinColumn(name = "fk_idQuestion")
    private Question question;

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer1 = (Answer) o;

        if (idAnswer != answer1.idAnswer) return false;
        if (answer != null ? !answer.equals(answer1.answer) : answer1.answer != null) return false;
        if (correct != null ? !correct.equals(answer1.correct) : answer1.correct != null) return false;
        if (question != null ? !question.equals(answer1.question) : answer1.question != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnswer;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (correct != null ? correct.hashCode() : 0);
        return result;
    }
}