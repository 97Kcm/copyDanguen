package com.dangeun.mapper;

import com.dangeun.dto.CustomUserDTO;
import com.dangeun.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insertUser(UserDTO userDTO);

    void insertSocialUser(CustomUserDTO customUserDTO);

    UserDTO SelectUserById(String id);

    UserDTO selectChatRoomUserInfo(String email);

    UserDTO selectUserByName(String name);

    CustomUserDTO selectCustomUserById(String id);
}
