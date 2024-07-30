package com.dangeun.service;

import com.dangeun.dto.UserDTO;
import com.dangeun.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Log4j2
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("로그인을 시도하는 유저 명 : " + username);
        UserDTO findUser = userMapper.SelectUserById(username);

        if(Objects.isNull(findUser)){
            throw new UsernameNotFoundException("ERROR : user not found");
        }
        return findUser;


    }
}
