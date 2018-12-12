package xyz.homesangsang.securitydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/user")
    public String uesr() {
        return "user";
    }

    @RequestMapping("/header")
    public String header() {
        return "header";
    }
}
