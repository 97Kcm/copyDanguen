package com.dangeun.mapper;

import com.dangeun.dto.ChatDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    List<ChatDTO> selectAllChatRoomInfo(String myId);

    ChatDTO selectChatRoom(Integer boardNo);

    void insertInfoByChatRoom(
            ChatDTO chatDTO
    );


}
