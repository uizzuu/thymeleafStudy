package com.my.thymeleafTest.controller;

import com.my.thymeleafTest.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class Productcontroller {
    @GetMapping("/info")
    public String productInfo(Model model) {
        // 리스트 보내기
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product("콜라", 1000, 10);
        productList.add(p1);
        Product p2 = new Product("사이다", 1200, 7);
        productList.add(p2);
        model.addAttribute("list", productList);
        System.out.println(productList);
        // Map으로 보내기
        Map<String, Product> map = new HashMap<>();
        Product pm1 = new Product("콜라", 1000, 10);
        map.put("p1", pm1);
        Product pm2 = new Product("사이다", 1200, 7);
        map.put("p2", pm2);
        model.addAttribute("map", map);
        System.out.println(map);
        return "/product/product_info";
    }
}
