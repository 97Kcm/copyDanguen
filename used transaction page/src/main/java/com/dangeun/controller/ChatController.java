package com.dangeun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate template;

    @GetMapping("/chat")
    public void get_chat(
            @RequestParam(required = false, value = "userId") String userId
    ){
//        template.convertAndSend("/topic/${userId}");
    }
}
