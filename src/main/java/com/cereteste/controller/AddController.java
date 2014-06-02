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
@RequestMapping("/user")
public class AddController {

    UserService service = new UserServiceImpl();

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUserPage(ModelMap model) {
        model.addAttribute("user",  new User());
        return "add";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @SessionScoped
    public String addUser(@ModelAttribute User user, ModelMap model, HttpSession session) {
        user.setType(1);
        service.addUser(user);
        session.setAttribute("user", user);
        return "redirect:/index";
    }
}