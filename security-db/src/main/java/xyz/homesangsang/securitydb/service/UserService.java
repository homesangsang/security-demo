package xyz.homesangsang.securitydb.service;

import xyz.homesangsang.securitydb.entity.UserEntity;

public interface UserService {
    UserEntity getUser(Integer userId);

    UserEntity saveUser(UserEntity user);
}
