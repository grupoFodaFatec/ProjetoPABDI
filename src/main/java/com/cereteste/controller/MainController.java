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

    @RequestMapping(value = {"/mainAdm", "/mainUser"}, method = RequestMethod.GET)
    @SessionScoped
    public String mainPage(ModelMap model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            if (user.getType() == 1) return "mainAdm";
            else return "mainUser";
        }
        return "redirect:/index";
    }
}