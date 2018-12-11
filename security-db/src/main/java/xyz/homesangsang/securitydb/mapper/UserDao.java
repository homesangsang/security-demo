package xyz.homesangsang.securitydb.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.homesangsang.securitydb.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {

    UserEntity findUserEntitysById(Integer id);

    UserEntity findUserEntityByUsername(String username);

    UserEntity findUserEntityByUsernameAndPassword(String username, String password);

}
