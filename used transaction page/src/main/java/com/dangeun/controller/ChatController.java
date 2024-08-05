package com.dangeun.controller;

import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.ChatTextDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.service.ChatService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;


    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public String get_chat(
            HttpServletRequest request,
            @RequestParam(required = false, value = "boardNo") Integer boardNo,
            @AuthenticationPrincipal UserDTO userDTO,
            Model model
            ){
        ChatDTO chatRoom = chatService.selectChatRoom(boardNo);
        List<ChatDTO> chatInfos = chatService.selectAllChatRoom(userDTO);
        System.out.println("chatInfos" + chatInfos);
        List<ChatTextDTO> chatList = chatService.getChatList(boardNo);
        System.out.println("chatList" + chatList);
        if(!chatList.isEmpty()){
            model.addAttribute("chatList", chatList);
        }
        System.out.println("chatRoom : " + chatRoom);

        model.addAttribute("chatRoom", chatRoom);
        model.addAttribute("nowBoardNo", boardNo);
        model.addAttribute("chatInfos", chatInfos);
        return "/chat";
    }

//    @SendTo("/topic/{boardNo}")
    @MessageMapping("/{boardNo}")
    public void greeting_message(
            @DestinationVariable("boardNo") Integer boardNo,
            @Payload ChatTextDTO chatTextDTO
    ){
        System.out.println(boardNo);
        System.out.println(chatTextDTO);

        SimpleDateFormat nowTime = new SimpleDateFormat("a HH:mm");
        Date now = new Date();
        String nowTimeString = nowTime.format(now);


        chatService.createChatText(
                chatTextDTO.builder().
                        boardNo(boardNo).
                        id(chatTextDTO.getId()).
                        nickname(chatTextDTO.getNickname()).
                        message(chatTextDTO.getMessage()).
                        nowDate(nowTimeString).
                        build());
        List<ChatTextDTO> chatList = chatService.getChatList(boardNo);

        messagingTemplate.convertAndSend("/topic/" + boardNo + "/list", chatList);

        messagingTemplate.convertAndSend("/topic/" + boardNo, chatTextDTO.builder().
                boardNo(boardNo).
                id(chatTextDTO.getId()).
                nickname(chatTextDTO.getNickname()).
                message(chatTextDTO.getMessage()).
                nowDate(nowTimeString).
                build());
    }


}
