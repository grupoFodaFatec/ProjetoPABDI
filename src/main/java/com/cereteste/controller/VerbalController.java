package com.cereteste.controller;

import com.cereteste.pojo.*;
import com.cereteste.service.AnswerService;
import com.cereteste.service.GameService;
import com.cereteste.service.QuestionService;
import com.cereteste.service.ScoreService;
import com.cereteste.service.impl.AnswerServiceImpl;
import com.cereteste.service.impl.GameServiceImpl;
import com.cereteste.service.impl.QuestionServiceImpl;
import com.cereteste.service.impl.ScoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/verbal")
public class VerbalController {

    QuestionService questionService = new QuestionServiceImpl();
    AnswerService answerService = new AnswerServiceImpl();
    ScoreService scoreService = new ScoreServiceImpl();
    GameService gameService = new GameServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    @SessionScoped
    public String verbalPage(ModelMap model, HttpSession session) {
        session.setAttribute("cont", 0);

        List<Question> questions = questionService.getRandomQuestions();
        Question question = questions.get((Integer) session.getAttribute("cont"));

        Score score = new Score();
        score.setDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        score.setScore(0);
        score.setUser((User) session.getAttribute("user"));
        scoreService.addScore(score);

        model.addAttribute("question", question);
        model.addAttribute("answers", answerService.getAnswersQuestion(question));

        session.setAttribute("score", score);
        session.setAttribute("result", 1000);
        session.setAttribute("questions", questions);
        session.setAttribute("games", new LinkedList<Game>());
        session.setAttribute("rights", new LinkedList<Answer>());

        return "verbal";
    }

    @RequestMapping(value="/next", method = RequestMethod.POST)
    @SessionScoped
    public @ResponseBody
    String getQuestions(@ModelAttribute Game game, ModelMap model, HttpSession session) {
        List<Question> questions = (List) session.getAttribute("questions");
        List<Game> games = (List) session.getAttribute("games");
        int cont = (Integer) session.getAttribute("cont");
        int result = (Integer) session.getAttribute("result");

        games.add(game);
        session.setAttribute("games", games);

        game.setScore((Score) session.getAttribute("score"));
        game.setQuestion((Question) questions.get(cont));
        gameService.addGame(game);

        if (cont < 5) {
            session.setAttribute("cont", ++cont);

            Question q = questions.get((Integer) session.getAttribute("cont"));
            List<Answer> answers = answerService.getAnswersQuestion(q);
            Answer right = answerService.getRight(questions.get(cont-1));

            // TODO - DEFINIR REGRA DE PONTUAÇÃO
            //if (game.getAnswer().equals(right.getCorrect())) result -= game.getTime();

            String json ="{\"question\":\"" + q.getQuestion() +
                    "\",\"answer0\":\""+ answers.get(0).getAnswer() +
                    "\",\"answer1\":\""+ answers.get(1).getAnswer() +
                    "\",\"answer2\":\""+ answers.get(2).getAnswer() +
                    "\",\"answer3\":\""+ answers.get(3).getAnswer() +
                    "\",\"answer4\":\""+ answers.get(4).getAnswer() +"\"}";

            return json;
        }
        return null;
    }

    @RequestMapping(value = "/finish", method = RequestMethod.GET)
    @SessionScoped
    public String finish(ModelMap model, HttpSession session) {
        List<Game> games = (List) session.getAttribute("games");
        Score score = (Score) session.getAttribute("score");
        int result = (Integer) session.getAttribute("result");

        score.setScore(result);
        scoreService.updateScore(score);

        session.removeAttribute("questions");
        session.removeAttribute("cont");
        session.removeAttribute("score");
        session.removeAttribute("games");
        session.removeAttribute("result");

        return "redirect:/ranking";
    }
}