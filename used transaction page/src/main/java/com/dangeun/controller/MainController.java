package com.dangeun.controller;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.FileDTO;
import com.dangeun.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public void get_main(
            @RequestParam(value = "searchTitle", defaultValue = "") String searchTitle,
            @RequestParam(value = "searchAddress", defaultValue = "")String searchAddress,
            @RequestParam(value = "searchCategory", defaultValue = "")String searchCategory,
            Model model
    ){
        List<BoardDTO> boards = mainService.searchBoard(searchTitle,searchAddress,searchCategory);
        model.addAttribute("boards", boards);
    }



}
