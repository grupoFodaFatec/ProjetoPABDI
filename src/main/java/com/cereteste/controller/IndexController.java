package com.cereteste.controller;

import com.cereteste.pojo.User;
import com.cereteste.service.UserService;
import com.cereteste.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.enterprise.context.SessionScoped;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    UserService service = new UserServiceImpl();

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String indexPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @SessionScoped
    public String login(@ModelAttribute User user, ModelMap model, HttpSession session) {
        User u = service.login(user);
        if (u != null) {
            session.setAttribute("user", u);
            if (u.getType() == 0) return "redirect:/adm";
            else return "redirect:/main";
        }
        return "redirect:/index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @SessionScoped
    public String logout(ModelMap model, HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/index";
    }
}