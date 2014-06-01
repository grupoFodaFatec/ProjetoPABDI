package com.cereteste.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Score {

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "idScore", nullable = false, insertable = true, updatable = true, columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    private int idScore;
	
    @Column(name = "score", nullable = true, insertable = true, updatable = true)
    private Integer score;
	
    @Column(name = "date", nullable = true, insertable = true, updatable = true, length = 10)
    private String date;

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score1 = (Score) o;

        if (idScore != score1.idScore) return false;
        if (date != null ? !date.equals(score1.date) : score1.date != null) return false;
        if (score != null ? !score.equals(score1.score) : score1.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idScore;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}