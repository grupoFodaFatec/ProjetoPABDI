package com.cereteste.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "idQuestion", nullable = false, insertable = true, updatable = true, columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    private int idQuestion;
	
    @Column(name = "question", nullable = true, insertable = true, updatable = true, length = 300)
    private String question;
	
    @Column(name = "type", nullable = true, insertable = true, updatable = true)
    private Integer type;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question1 = (Question) o;

        if (idQuestion != question1.idQuestion) return false;
        if (question != null ? !question.equals(question1.question) : question1.question != null) return false;
        if (type != null ? !type.equals(question1.type) : question1.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idQuestion;
        result = 31 * result + (question != null ? question.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}