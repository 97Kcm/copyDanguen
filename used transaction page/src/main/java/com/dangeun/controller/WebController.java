package com.dangeun.controller;

import com.dangeun.dto.ChatDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    @SendTo("/topic/{boardNo}")
    @MessageMapping("/{boardNo}")
    public ChatDTO greeting_message(
            ChatDTO chatDTO
    ){
        return chatDTO;
    }
}
