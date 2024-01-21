package com.zbrickx.tymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // new controller method to show the initial form
    @RequestMapping("/showForm")
    public String showFrom(){
        return "helloworld-form";
    }
    // need a controller method to process the html form

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    //create controller to read data from fomr
    // add that data in the model

    @RequestMapping("/processFormV2")
    public String ShoutDude(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        String result ="Yo! " + name.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String ShoutDudeV(@RequestParam("studentName") String name, Model model){
       // String name = request.getParameter("studentName");
        String result ="Yo! " + name.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
