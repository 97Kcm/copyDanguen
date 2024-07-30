package com.dangeun.mapper;

import com.dangeun.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insertUser(UserDTO userDTO);

    UserDTO SelectUserById(String id);
}
