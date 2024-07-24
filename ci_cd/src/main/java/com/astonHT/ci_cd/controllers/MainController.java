package com.astonHT.ci_cd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class MainController {
    @GetMapping("/home")
    public String homePage(Model model) {
        System.out.println("test message for check Jenkins 2");
        model.addAttribute("name", "Main page");
        return "home";
    }

    @GetMapping("/")
    public String homePageSecond(Model model) {
        model.addAttribute("name", "Main page 2");
        return "home2";
    }
}
