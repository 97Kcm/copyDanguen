package com.dangeun.controller;

import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.ChatTextDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.service.ChatService;
import com.dangeun.service.UserService;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;


    @Autowired
    private ChatService chatService;
    @Autowired
    private UserService userService;

    @GetMapping("/chat")
    public String get_chat(
            HttpServletRequest request,
            @RequestParam(required = false, value = "boardNo") Integer boardNo,
            @AuthenticationPrincipal UserDTO userDTO,
            Model model
            ){
        // 현재 보드번호의 방 정보와 채팅을 하는 두 유저의 정보 조회
        if(boardNo != null){
            System.out.println("boardNo : " + boardNo);
            ChatDTO chatRoom = chatService.selectChatRoom(boardNo);
            System.out.println("chatRoom : " + chatRoom);
            model.addAttribute("chatRoom", chatRoom);
            UserDTO chatRoomBuyUser = userService.selectChatRoomUserInfo(chatRoom.getChatRoomBuyUser());
            UserDTO chatRoomSellUser = userService.selectChatRoomUserInfo(chatRoom.getChatRoomSellUser());
            System.out.println(chatRoomSellUser);
            System.out.println(chatRoomBuyUser);
            model.addAttribute("chatRoomSellUser", chatRoomSellUser);
            model.addAttribute("chatRoomBuyUser", chatRoomBuyUser);
        }else{
            System.out.println("boardNo : " + boardNo);
            model.addAttribute("chatRoom", null);
        }

        List<ChatDTO> chatList = chatService.getChatList(boardNo);
        model.addAttribute("chatList", chatList);
        System.out.println("chatList : " + chatList);



        // 현재 로그인된 유저의 정보와 일치하는 아이디가 있다면 전부 가져오기
        List<ChatDTO> allChatRoomInfo = chatService.selectAllChatRoom(userDTO);
        System.out.println(allChatRoomInfo);
        model.addAttribute("allChatRoomInfo", allChatRoomInfo);

        List<UserDTO> allChatRoomBuyUser = new ArrayList<>();
        List<UserDTO> allChatRoomSellUser = new ArrayList<>();
        for(ChatDTO chatRoomUserInfo : allChatRoomInfo){
            allChatRoomBuyUser.add(userService.selectChatRoomUserInfo(chatRoomUserInfo.getChatRoomBuyUser()));
            allChatRoomSellUser.add(userService.selectChatRoomUserInfo(chatRoomUserInfo.getChatRoomSellUser()));
        }
        System.out.println(allChatRoomBuyUser);
        System.out.println(allChatRoomSellUser);
        model.addAttribute("allChatRoomBuyUser", allChatRoomBuyUser);
        model.addAttribute("allChatRoomSellUser", allChatRoomSellUser);


        return "/chat";
    }

//    @SendTo("/topic/{boardNo}")
    @MessageMapping("/{boardNo}")
    public void greeting_message(
            @DestinationVariable("boardNo") Integer boardNo,
            @Payload ChatTextDTO chatTextDTO
    ){
//        System.out.println(boardNo);
//        System.out.println(chatTextDTO);

        SimpleDateFormat nowTime = new SimpleDateFormat("a HH:mm");
        Date now = new Date();
        String nowTimeString = nowTime.format(now);


        chatService.createChatText(
                chatTextDTO.builder().
                        boardNo(boardNo).
                        nickname(chatTextDTO.getNickname()).
                        message(chatTextDTO.getMessage()).
                        nowDate(nowTimeString).
                        build());
//        List<ChatDTO> chatList = chatService.getChatList(boardNo);

        List<ChatDTO> chatList = chatService.getChatList(boardNo);
        System.out.println("chatList : " + chatList);
//        messagingTemplate.convertAndSend("/topic/" + boardNo + "/list", chatList);

        messagingTemplate.convertAndSend("/topic/" + boardNo,
                chatTextDTO.builder().
                boardNo(boardNo).
                nickname(chatTextDTO.getNickname()).
                message(chatTextDTO.getMessage()).
                nowDate(nowTimeString).
                build());
    }


}
