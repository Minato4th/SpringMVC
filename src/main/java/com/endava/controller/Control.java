package com.endava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
    @RequestMapping(value = "/")
    public String home(){
        return"HelloWorld";
    }
}
