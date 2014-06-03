package com.cereteste.controller;

import com.cereteste.pojo.Answer;
import com.cereteste.pojo.FakeQuestion;
import com.cereteste.pojo.Question;
import com.cereteste.service.AnswerService;
import com.cereteste.service.QuestionService;
import com.cereteste.service.impl.AnswerServiceImpl;
import com.cereteste.service.impl.QuestionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

    private QuestionService questionService = new QuestionServiceImpl();
    private AnswerService awsAnswerService = new AnswerServiceImpl();

    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public ModelAndView questionPage() {
        ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("fakeQuestion", new FakeQuestion());
        return modelAndView;
    }

    @RequestMapping(value = "/question/add", method = RequestMethod.POST)
    public String questionAdd(@ModelAttribute FakeQuestion fakequestion) {
        //Create and save Question
            Question question = fakequestion.createQuestion();
            question.setType(1);
            questionService.addQuestion(question);

        //Create and Save Answer
            awsAnswerService.addAnswer(fakequestion.createAnswerA());
            awsAnswerService.addAnswer(fakequestion.createAnswerB());
            awsAnswerService.addAnswer(fakequestion.createAnswerC());
            awsAnswerService.addAnswer(fakequestion.createAnswerD());
            awsAnswerService.addAnswer(fakequestion.createAnswerE());
        return "redirect:/question";
    }
}