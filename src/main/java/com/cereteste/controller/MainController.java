package com.cereteste.controller;

import com.cereteste.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping(value = "/adm", method = RequestMethod.GET)
    @SessionScoped
    public String mainAdm(ModelMap model, HttpSession session) {
        if (!session.getAttribute("user").equals(null)) return "mainAdm";
        return "redirect:/index";
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    @SessionScoped
    public String mainUser(ModelMap model, HttpSession session) {
        if (!session.getAttribute("user").equals(null)) return "mainUser";
        return "redirect:/index";
    }
}