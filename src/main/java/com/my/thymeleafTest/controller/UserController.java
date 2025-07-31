package com.my.thymeleafTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("login")
    public String userLogin() {
        return "/user/userLogin";
    }

    @GetMapping("login/success")
    public String userLoginSuccess() {
        return "/user/userLoginSuccess";
    }

    @GetMapping("info")
    public String userInfo() {
        return "/user/userInfo";
    }

    @GetMapping("infoSave")
    public String userInfoSave() {
        System.out.println("사용자 정보를 저장했습니다.");
        return "redirect:/main";
    }
}