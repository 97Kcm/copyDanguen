package com.dangeun.service;

import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.mapper.ChatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatMapper chatMapper;

    public List<ChatDTO> selectAllChatRoom(UserDTO userDTO){
        return chatMapper.selectAllChatRoomInfo(userDTO.getEmail());
    }

    public ChatDTO selectChatRoom(Integer boardNo){
        return chatMapper.selectChatRoom(boardNo);
    }

    public void insertInfoByChatRoom(ChatDTO chatDTO){
        chatMapper.insertInfoByChatRoom(chatDTO);
    }
}
