package xyz.homesangsang.securitynodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {


    @GetMapping({"/", "/index", "/home"})
    public String root(){
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/user")
    public String user() {
        return "user";
    }
}
