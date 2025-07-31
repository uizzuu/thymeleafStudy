package com.my.thymeleafTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("basic")
public class ThymeleafController {
    @GetMapping("iveInfoPrint")
    public String iveInfoPrint() {
        return "/basic/iveInfoPrint";
    }
}
