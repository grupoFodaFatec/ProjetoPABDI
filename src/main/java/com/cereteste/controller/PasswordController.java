package com.cereteste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/password")
public class PasswordController {

    @RequestMapping(method = RequestMethod.GET)
    public String passwordPage(ModelMap model) {
        return "password";
    }
}