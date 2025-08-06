package com.my.thymeleafTest.controller;

import com.my.thymeleafTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("basic")
public class ThymeleafController {
    @GetMapping("/iveInfoPrint")
    public String iveInfoPrint(Model model) {
        model.addAttribute("name", "장원영");
        model.addAttribute("age", 20);
        model.addAttribute("data", "Hello <b>Spring</b> boot");
        return "/basic/iveInfoPrint";
    }

    @GetMapping("/variable")
    public String variable(Model model) {
        IveMember member = new IveMember();
        member.setMemberName("안유진");
        member.setMemberAge(21);
        member.setMemberAddress("서울");
        System.out.println(member);
        model.addAttribute("member", member);
        // 리스트 보내기
        List<IveMember> memberList = new ArrayList<>();
        IveMember iveMember = new IveMember("리즈", 20, "제주도");
        memberList.add(iveMember);
        model.addAttribute("list", memberList);
        System.out.println(memberList);
        //Map으로 보내기
        Map<String, IveMember> map = new HashMap<>();
        IveMember member1 = new IveMember("가을", 22, "경기도");
        map.put("m1", member1);
        IveMember member2 = new IveMember("레이", 20, "일본");
        map.put("m2", member2);
        model.addAttribute("map", map);
        System.out.println(map);
        return "/basic/variable_object";
    }
}
