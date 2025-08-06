package com.my.thymeleafTest.controller;

//import com.my.thymeleftTest.dto.IveMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LinkController {
    @GetMapping("/hello")
    public String hello() {
        return "hello_result";
    }

    @GetMapping("/query")
    //  localhost:8080/query?name=장원영&age=21
    public String query(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            Model model) {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        model.addAttribute("info",
                name + " " + age);
        return "/link/query_result";
    }

    @GetMapping("/queryDTO")
    public <IveMember> String queryDTO(IveMember member, Model model) {
        System.out.println(member);
        model.addAttribute("info", member);
        return "/link/query_result";
    }

    @GetMapping("/path/{name}/{age}")
    public String pathMapping(
            @PathVariable("name")String name,
            @PathVariable("age")int age,
            Model model) {
        model.addAttribute("info",
                name + " " + age);
        return "/link/query_result";
    }

    // http://localhost:8080/장원영?address=서울
    @GetMapping("/{id}")
    public String queryAndPath(Model model,
               @PathVariable("id")String name,
               @RequestParam("address")String address) {

        model.addAttribute("info",
                name + " " + address);
        return "/link/query_result";
    }
}