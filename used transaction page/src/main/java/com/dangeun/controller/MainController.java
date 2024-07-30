package com.dangeun.controller;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.FileDTO;
import com.dangeun.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public void get_main(
            Model model
    ){
        List<BoardDTO> boards = mainService.createBoard();
        model.addAttribute("boards", boards);
    }

















}
