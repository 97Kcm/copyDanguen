package com.dangeun.controller;

import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.service.ChatService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String get_chat(
            @RequestParam(required = false, value = "boardNo") Integer boardNo,
            @AuthenticationPrincipal UserDTO userDTO,
            Model model
            ){
        ChatDTO chatRoom = chatService.selectChatRoom(boardNo);
        List<ChatDTO> chatInfos = chatService.selectAllChatRoom(userDTO);
//        template.convertAndSend("/topic/"+boardNo);
        System.out.println(chatInfos);
        model.addAttribute("chatInfos", chatInfos);
        return "/chat";
    }
}
