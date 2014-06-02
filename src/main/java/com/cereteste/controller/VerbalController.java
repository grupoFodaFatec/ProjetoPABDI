package com.cereteste.controller;

import com.cereteste.service.QuestionService;
import com.cereteste.service.impl.QuestionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/verbal")
public class VerbalController {

    QuestionService service = new QuestionServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public String verbalPage(ModelMap model) {
        return "verbal";
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public String getQuestions(ModelMap model) {
        model.addAttribute("questions", service.getRandomQuestions());
        return "redirect:/verbal";
    }
}