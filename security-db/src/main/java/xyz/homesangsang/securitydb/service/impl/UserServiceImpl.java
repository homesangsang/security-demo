package xyz.homesangsang.securitydb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.homesangsang.securitydb.entity.UserEntity;
import xyz.homesangsang.securitydb.mapper.UserDao;
import xyz.homesangsang.securitydb.service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity getUser(Integer userId) {
        return userDao.findUserEntitysById(userId);
    }
}
