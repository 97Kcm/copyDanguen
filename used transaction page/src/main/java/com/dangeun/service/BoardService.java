package com.dangeun.service;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.ChatDTO;
import com.dangeun.dto.UserDTO;
import com.dangeun.mapper.BoardMapper;
import com.dangeun.mapper.ChatMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;


    public List<BoardDTO> getAllBoardsInfo(){
        return boardMapper.selectAllBoards();
    }

    public BoardDTO getBoardInfo(Integer no){
        return boardMapper.selectBoard(no);
    }

    public void createNewBoard(BoardDTO boardDTO, String email){
        boardMapper.insertNoticeBoardData(email, boardDTO);
    }
    public void insertBoardImage(BoardDTO boardDTO){
        boardMapper.insertNoticeBoardImages(boardDTO);
    }



}
