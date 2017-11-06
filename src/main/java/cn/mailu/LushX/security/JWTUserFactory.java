package cn.mailu.LushX.security;

import cn.mailu.LushX.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: NULL
 * @Description:创建JWTUser工厂类
 * @Date: Create in 2017/11/5 23:40
 */
public final class JWTUserFactory{

    private JWTUserFactory(){

    }

   /* public static JWTUserDetails creat(User user){
        return new JWTUserDetails(
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
               // mapToGrantedAuthorities(user.getRoles())
        );
    }*/

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities){
        return authorities.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

}