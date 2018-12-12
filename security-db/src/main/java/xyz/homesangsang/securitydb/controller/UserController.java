package xyz.homesangsang.securitydb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.homesangsang.securitydb.entity.UserEntity;
import xyz.homesangsang.securitydb.service.UserService;
import xyz.homesangsang.securitydb.util.R;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public UserEntity getUserByUserId(@PathVariable("userId") Integer userId) {
        return userService.getUser(userId);
    }

    @PostMapping("/user/save")
    public R registerUser (UserEntity user) {
        userService.saveUser(user);
        return R.ok();
    }

}
