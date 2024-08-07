package com.dangeun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ChatDTO {
    private Integer chatRoomNo;
    private String chatRoomSellUser;
    private String chatRoomBuyUser;
    private List<ChatTextDTO> chatTextDTO;
    private List<UserDTO> userDTO;
}
