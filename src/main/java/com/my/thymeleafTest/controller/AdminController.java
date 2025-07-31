package com.my.thymeleafTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
    @GetMapping("info")
    public String adminInfo() {
        return "/admin/adminInfo";
    }

    @GetMapping("report")
    public String adminReport() {
        return "/admin/adminReport";
    }
}
