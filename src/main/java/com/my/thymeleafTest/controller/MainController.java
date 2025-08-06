package com.my.thymeleafTest.controller;

import com.my.thymeleafTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    // http://localhost:8080/main 과 http://localhost:8080 모두 접속
    @GetMapping({"main", "/"})
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping("/link")
    public String linkPage(Model model) {
        IveMember member = new
                IveMember("장원영", 21, "서울");
        model.addAttribute("jang", member);
        return "/link/link_test";
    }

    @GetMapping("/each")
    public String eachTest(Model model) {
        List<IveMember> iveMembers = new ArrayList<>(
                Arrays.asList(
                        new IveMember("장원영", 20, "서울"),
                        new IveMember("안유진", 21, "대전"),
                        new IveMember("리즈", 20, "제주"),
                        new IveMember("가을", 22, "경기")
                )
        );
        model.addAttribute("ive", iveMembers);
        return "/user/for_each";
    }
}
