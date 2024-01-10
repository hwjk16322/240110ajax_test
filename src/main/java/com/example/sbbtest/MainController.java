package com.example.sbbtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    int vote = 1;

    @GetMapping("/")
    public String root(Model model) {

        model.addAttribute("vote",vote);
        return "vote";
    }

    @GetMapping("/vote")
    @ResponseBody
    public String Vote() {
        vote++;
        Integer count = this.vote;
        return count.toString();
    }
}

