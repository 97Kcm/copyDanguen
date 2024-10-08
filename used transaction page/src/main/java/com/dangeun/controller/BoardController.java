package com.dangeun.controller;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.FileDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.service.BoardService;
import com.dangeun.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @Autowired
    private ChatService chatService;

    @GetMapping("/board/{no}")
    public String get_board(
            @PathVariable("no") Integer no,
            Model model
    ){
        List<BoardDTO> allBoards = boardService.getAllBoardsInfo();
        List<BoardDTO> randomBoards = getRandomBooks(allBoards, allBoards.size());

        if(allBoards.size() >= 6) {
            randomBoards = getRandomBooks(allBoards, 6);
        }

        BoardDTO boards = boardService.getBoardInfo(no);
        model.addAttribute("user", boards.getUser());
        model.addAttribute("boards", boards);
        model.addAttribute("randomBoards", randomBoards);

        return "board";
    }

    @PostMapping("/board")
    public String post_board(
            @AuthenticationPrincipal UserDTO userDTO,
            ChatDTO chatDTO
    ){
        // chatDTO = 로그인한 현재 아이디, 보드를 만든 유저 아이디, 현재 보드 번호
        // 현재 로그인한 유저의 아이디가 있는 board정보 전부 가져오기
        List<ChatDTO> chatAllRoomInfo = chatService.selectAllChatRoom(userDTO);
        boolean result = true;
        for(ChatDTO chat : chatAllRoomInfo){
            // 한번 채팅한 내역이 있는 유저나 방 목록이면 false 출력
            if(chatDTO.getChatRoomNo().equals(chat.getChatRoomNo()) || chatDTO.getChatRoomSellUser().equals(chat.getChatRoomSellUser())){
                result = false;
            }
        }
        if(!chatDTO.getChatRoomBuyUser().equals(chatDTO.getChatRoomSellUser())){
            if(result){
                chatService.insertInfoByChatRoom(chatDTO);
                return "redirect:/chat?boardNo=" + chatDTO.getChatRoomNo();
            }
            else{
                return "redirect:/chat";
            }
        }
        System.out.println("안가짐");
        return "redirect:/board/"+chatDTO.getChatRoomNo();
    }


    @GetMapping("/write")
    public void get_write(
            Model model
    ){
        List<BoardDTO> allBoards = boardService.getAllBoardsInfo();
        List<BoardDTO> randomBoards = getRandomBooks(allBoards, allBoards.size());
        model.addAttribute("randomBoards", randomBoards);
    }

    @PostMapping("/write")
    public String post_write(
            @AuthenticationPrincipal UserDTO user,
            BoardDTO boardDTO
    ){
        boardService.createNewBoard(boardDTO, user.getEmail());
        boardService.insertBoardImage(boardDTO);
        return "redirect:/main";
    }

    private List<BoardDTO> getRandomBooks(List<BoardDTO> boards, int i) {
        Random random = new Random();
        return random.ints(0, boards.size())
                .distinct() // 중복 제거
                .limit(i)
                .mapToObj(boards::get)
                .collect(Collectors.toList());
    }


}
