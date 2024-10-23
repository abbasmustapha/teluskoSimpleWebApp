package com.mab.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to telusko Mab Home page";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to telusko About Page";
    }

}
