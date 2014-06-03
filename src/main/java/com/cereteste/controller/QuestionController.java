package com.cereteste.controller;

import com.cereteste.service.impl.AnswerServiceImpl;
import com.cereteste.service.impl.QuestionServiceImpl;
import com.cereteste.workaround.QuestionObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/question")
public class QuestionController {

    private QuestionServiceImpl questionService;
    private AnswerServiceImpl awsAnswerService;

    @RequestMapping(method = RequestMethod.GET)
    public String questionPage(ModelMap model) {
        model.addAttribute("question", new QuestionObject());
        return "question";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String questionAdd(@ModelAttribute QuestionObject questionObject, ModelMap model) {
        if(questionObject != null){
            if(questionObject.getQuestion() != null){
                questionObject.getQuestion().setType(1);
                questionService.addQuestion(questionObject.getQuestion());

                if(questionObject.getAnswerA()!= null && questionObject.getAnswerB()!= null &&
                        questionObject.getAnswerC()!= null && questionObject.getAnswerD()!= null &&
                        questionObject.getAnswerE()!= null) {
                            questionObject.getAnswerA().setQuestion(questionObject.getQuestion());
                            questionObject.getAnswerB().setQuestion(questionObject.getQuestion());
                            questionObject.getAnswerC().setQuestion(questionObject.getQuestion());
                            questionObject.getAnswerD().setQuestion(questionObject.getQuestion());
                            questionObject.getAnswerE().setQuestion(questionObject.getQuestion());

                            awsAnswerService.addAnswer(questionObject.getAnswerA());
                            awsAnswerService.addAnswer(questionObject.getAnswerB());
                            awsAnswerService.addAnswer(questionObject.getAnswerC());
                            awsAnswerService.addAnswer(questionObject.getAnswerD());
                            awsAnswerService.addAnswer(questionObject.getAnswerE());
                }else System.out.println("respostas nulas");
            }else System.out.println("Questao nula");
        }else System.out.println("Tudo nulo");
        return "redirect:/question";
    }
}