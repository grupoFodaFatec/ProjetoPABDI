package com.cereteste.controller;

import com.cereteste.pojo.Answer;
import com.cereteste.pojo.Question;
import com.cereteste.pojo.Score;
import com.cereteste.pojo.User;
import com.cereteste.service.AnswerService;
import com.cereteste.service.QuestionService;
import com.cereteste.service.ScoreService;
import com.cereteste.service.impl.AnswerServiceImpl;
import com.cereteste.service.impl.QuestionServiceImpl;
import com.cereteste.service.impl.ScoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/verbal")
public class VerbalController {

    QuestionService questionService = new QuestionServiceImpl();
    AnswerService answerService = new AnswerServiceImpl();
    ScoreService scoreService = new ScoreServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    @SessionScoped
    public String verbalPage(ModelMap model, HttpSession session) {
        List<Question> questions = (List) session.getAttribute("questions");
        Question question = questions.get((Integer) session.getAttribute("cont"));
        List<Answer> answers = answerService.getAnswersQuestion(question);

        model.addAttribute("question", question);
        model.addAttribute("answers", answers);

        Score score = new Score();
        score.setDate(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        score.setScore(0);
        score.setUser((User) session.getAttribute("user"));
        scoreService.addScore(score);
        session.setAttribute("score", score);

        return "verbal";
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @SessionScoped
    public String verbalInit(ModelMap model, HttpSession session) {
        session.setAttribute("questions", questionService.getRandomQuestions());
        session.setAttribute("cont", 0);
        return "redirect:/verbal";
    }

    @RequestMapping(value="/next", method = RequestMethod.POST)
    @SessionScoped
    public @ResponseBody
    String getQuestions(ModelMap model, HttpSession session) {
        Integer cont = (Integer)session.getAttribute("cont");
        if (cont < 5) {
            session.setAttribute("cont", ++cont);
            List<Question> questions = (List) session.getAttribute("questions");
            Question q = questions.get((Integer) session.getAttribute("cont"));
            List<Answer> answers = answerService.getAnswersQuestion(q);

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

        //scoreService.updateScore((Score) session.getAttribute("score"));

        session.removeAttribute("questions");
        session.removeAttribute("cont");
        session.removeAttribute("score");

        return "redirect:/ranking";
    }
}