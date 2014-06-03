package com.cereteste.controller;

import com.cereteste.pojo.FakeQuestion;
import com.cereteste.pojo.Question;
import com.cereteste.service.AnswerService;
import com.cereteste.service.QuestionService;
import com.cereteste.service.impl.AnswerServiceImpl;
import com.cereteste.service.impl.QuestionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

    private QuestionService questionService = new QuestionServiceImpl();
    private AnswerService awsAnswerService = new AnswerServiceImpl();

    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public String questionPage() {
        return "question";
    }

    @RequestMapping(value = "/questionAdd", method = RequestMethod.GET)
    public ModelAndView questionAddPage() {
        ModelAndView modelAndView = new ModelAndView("questionAdd");
        modelAndView.addObject("fakeQuestion", new FakeQuestion());
        return modelAndView;
    }

    @RequestMapping(value = "/question/save", method = RequestMethod.POST)
    public String questionAdd(@ModelAttribute FakeQuestion fakequestion) {
        //Create and save Question
            questionService.addQuestion(fakequestion.createQuestion());

        //Create and Save Answer
            awsAnswerService.addAnswer(fakequestion.createAnswerA());
            awsAnswerService.addAnswer(fakequestion.createAnswerB());
            awsAnswerService.addAnswer(fakequestion.createAnswerC());
            awsAnswerService.addAnswer(fakequestion.createAnswerD());
            awsAnswerService.addAnswer(fakequestion.createAnswerE());
        return "redirect:/question";
    }

    @RequestMapping(value = "/questionList", method = RequestMethod.GET)
    public String questionListPage(ModelMap model) {
        model.addAttribute("questions", questionService.getQuestions());
        return "questionList";
    }


    @RequestMapping(value = "/questionEdit/{id}", method = RequestMethod.GET)
    public String questionListPage(@PathVariable Integer id, ModelMap model) {
        FakeQuestion fakeQuestion = new FakeQuestion();
        fakeQuestion = fakeQuestion.createFakeQuestion(questionService.getQuestion(id));
        model.addAttribute("fakeQuestion", fakeQuestion);
        return "questionEdit";
    }

    @RequestMapping(value = "/questionDelete/{id}", method = RequestMethod.GET)
    public String questionDelete(@PathVariable Integer id) {
        Question question = questionService.getQuestion(id);
        questionService.delete(question);
        return "question";
    }


}