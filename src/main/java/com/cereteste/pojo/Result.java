package com.cereteste.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Result {

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "idResult", nullable = false, insertable = true, updatable = true, columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    private int idResult;

    @ManyToOne
    @JoinColumn(name = "fk_idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_idScore")
    private Score score;

    public int getIdResult() {
        return idResult;
    }

    public void setIdResult(int idResult) {
        this.idResult = idResult;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;

        if (idResult != result.idResult) return false;
        if (user != result.user) return false;
        if (score != result.score) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idResult;
    }
}