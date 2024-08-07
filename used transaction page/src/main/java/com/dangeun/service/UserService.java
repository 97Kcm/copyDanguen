package com.dangeun.service;

import com.dangeun.dto.UserDTO;
import com.dangeun.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createUser(UserDTO userDTO){
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userMapper.insertUser(userDTO);
    }

    public UserDTO selectChatRoomUserInfo(String email){
        return userMapper.selectChatRoomUserInfo(email);
    }

}
