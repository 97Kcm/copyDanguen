package com.dangeun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatDTO {
    private Integer boardNo;
    private String myId;
    private String chatUserId;
    private String lastTime;
    private UserDTO userDTO;
}
