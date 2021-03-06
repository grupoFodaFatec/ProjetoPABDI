package com.cereteste.controller;

import com.cereteste.pojo.Score;
import com.cereteste.service.ScoreService;
import com.cereteste.service.impl.ScoreServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ranking")
public class RankingController {

    ScoreService service = new ScoreServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public String rankingPage(ModelMap model) {
        List<Score> l = service.getRanking();
        model.addAttribute("ranking", service.getRanking());
        return "ranking";
    }
}