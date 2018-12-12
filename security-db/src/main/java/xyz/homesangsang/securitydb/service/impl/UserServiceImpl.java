package xyz.homesangsang.securitydb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserEntity saveUser(UserEntity user) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRoles("ROLE_USER");
        userDao.saveAndFlush(user);
        return user;
    }
}
