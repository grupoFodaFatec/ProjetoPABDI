package com.cereteste.controller;

import com.cereteste.pojo.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @RequestMapping(method = RequestMethod.GET)
    public String questionPage(ModelMap model) {
        model.addAttribute("question", new Question());
        return "question";
    }
}