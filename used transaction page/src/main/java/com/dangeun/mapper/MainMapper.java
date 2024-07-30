package com.dangeun.mapper;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.FileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<BoardDTO> SelectAllBoard();


}
