package com.zbrickx.tymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/main")
public class DemoController {

    @GetMapping("/Hello")
    public String sayHello(Model model){
        model.addAttribute("TheDate", new Date());
        return "welcomePage";
    }
}
