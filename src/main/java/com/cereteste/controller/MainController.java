package com.cereteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String mainPage(ModelMap model) {
        return "mainAdm";
    }
}