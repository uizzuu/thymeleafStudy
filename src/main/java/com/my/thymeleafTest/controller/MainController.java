package com.my.thymeleafTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // http://localhost:8080/main 과 http://localhost:8080 모두 접속
    @GetMapping({"main", "/"})
    public String mainPage() {
        return "mainPage";
    }
}
