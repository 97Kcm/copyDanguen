package com.dangeun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ChatDTO {
    private Integer chatNo;
    private Integer boardNo;
    private String myId;
    private String chatUserId;
    private List<ChatTextDTO> chatTextDTO;
    private UserDTO userDTO;
}
