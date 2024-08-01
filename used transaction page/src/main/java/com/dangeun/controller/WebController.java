package com.dangeun.controller;

import com.dangeun.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @SendTo("/topic/{userId}")
    @MessageMapping("/{userId}")
    public MessageDTO greeting_message(
            MessageDTO messageDTO
    ){
        return messageDTO;
    }
}
