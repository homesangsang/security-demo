package xyz.homesangsang.securitydb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.homesangsang.securitydb.entity.UserEntity;
import xyz.homesangsang.securitydb.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public UserEntity getUserByUserId(@PathVariable("userId") Integer userId) {
        return userService.getUser(userId);
    }

}
