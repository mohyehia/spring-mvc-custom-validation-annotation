package com.mohyehia.customvalidation.controller;

import com.mohyehia.customvalidation.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/home")
    public String loadPage(Model model){
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/add")
    public String saveUser(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            return "home";
        }
        model.addAttribute("success", "Successfully saved user =>" + user);
        return "home";
    }
}
