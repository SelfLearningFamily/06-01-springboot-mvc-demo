package com.zbrickx.tymeleafdemo.controller;

import com.zbrickx.tymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${programmingLanguages}")
    private List<String> progLang;

    @Value("${systemOs}")
    private List<String> systemOs;

    @GetMapping("/showStudentForm")
    public String showModel(Model model){
        //create sutdent object
        Student student = new Student();
        //add sutdent object in model
        model.addAttribute("student",student);
        model.addAttribute("countries", countries);
        model.addAttribute("progLang", progLang);
        model.addAttribute("systemOs", systemOs);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student){
        //log data
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Student Country: " + student.getCountry());
        return "student-confirmation";
    }
}
