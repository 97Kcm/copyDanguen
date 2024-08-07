package com.dangeun.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatTextDTO {
    private Integer no;
    private Integer boardNo;
    private String nickname;
    private String message;
    private String nowDate;

}
