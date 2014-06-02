package com.cereteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/start")
public class StartController {

    @RequestMapping(method = RequestMethod.GET)
    public String startPage(ModelMap model) {
        return "start";
    }
}