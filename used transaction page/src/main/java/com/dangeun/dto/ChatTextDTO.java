package com.dangeun.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class ChatTextDTO {
    private Integer no;
    private Integer boardNo;
    private String id;
    private String nickname;
    private String message;
    private String nowDate;
    private ChatDTO chatDTO;

}
