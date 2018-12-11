package xyz.homesangsang.securitydb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import xyz.homesangsang.securitydb.entity.UserEntity;
import xyz.homesangsang.securitydb.mapper.UserDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnyUserDetailService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userDao.findUserEntityByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }
        String userRole = user.getRoles();
        String[] userRoleArr = userRole.split(",");
        List<SimpleGrantedAuthority> roleAuthorityList = new ArrayList<>();
        for (int i = 0; i < userRoleArr.length; i++) {
            String role = userRoleArr[i];
            if (!role.equals("")) {
                roleAuthorityList.add(new SimpleGrantedAuthority(role));
            }
        }
        return new User(user.getUsername(), user.getPassword(), roleAuthorityList);
    }
}
