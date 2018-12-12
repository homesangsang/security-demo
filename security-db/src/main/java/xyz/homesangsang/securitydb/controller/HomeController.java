package xyz.homesangsang.securitydb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.homesangsang.securitydb.entity.UserEntity;
import xyz.homesangsang.securitydb.service.UserService;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser (UserEntity user) {
        userService.saveUser(user);
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
