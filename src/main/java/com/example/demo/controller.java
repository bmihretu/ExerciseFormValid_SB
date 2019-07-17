package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class controller {

    @GetMapping("/carform")
    public String loadcarform(Model model){
        model.addAttribute("car1", new car());
        return "carform";
    }
    @PostMapping("/carform")
    public String processcarForm(@Valid car car1, BindingResult result){
        if(result.hasErrors()){
            return "carform";
        }
        return "carconfirm";
    }
}