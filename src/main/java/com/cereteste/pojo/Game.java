package com.cereteste.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Game {

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "idGame", nullable = false, insertable = true, updatable = true, columnDefinition = "INT NOT NULL AUTO_INCREMENT")
    private int idGame;

    @Column(name = "answer", nullable = true, insertable = true, updatable = true)
    private String answer;

    @Column(name = "time", nullable = true, insertable = true, updatable = true)
    private Integer time;

    @ManyToOne
    @JoinColumn(name = "fk_idScore")
    private Score score;

    @ManyToOne
    @JoinColumn(name = "fk_idQuestion")
    private Question question;

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
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

        Game game = (Game) o;

        if (idGame != game.idGame) return false;
        if (answer != null ? !answer.equals(game.answer) : game.answer != null) return false;
        if (time != null ? !time.equals(game.time) : game.time != null) return false;
        if (score != null ? !score.equals(game.score) : game.score != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGame;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}