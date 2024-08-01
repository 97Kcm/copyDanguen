package com.dangeun.service;

import com.dangeun.dto.BoardDTO;
import com.dangeun.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private MainMapper mainMapper;

    public List<BoardDTO> createBoard(){
        return mainMapper.SelectAllBoard();
    }

    public List<BoardDTO> searchBoard(String searchTitle, String searchAddress, String searchCategory){
        return mainMapper.selectSearchBoard(searchTitle, searchAddress, searchCategory);
    }

}
