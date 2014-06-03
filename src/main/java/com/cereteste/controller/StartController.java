package com.cereteste.controller;

import com.cereteste.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/start")
public class StartController {

    @RequestMapping(method = RequestMethod.GET)
    @SessionScoped
    public String startPage(ModelMap model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user != null){
            return "start";
        }
        return "redirect:/index";
    }
}