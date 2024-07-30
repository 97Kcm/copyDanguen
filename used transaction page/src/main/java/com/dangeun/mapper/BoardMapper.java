package com.dangeun.mapper;

import com.dangeun.dto.BoardDTO;
import com.dangeun.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {

    BoardDTO selectBoard(Integer no);

    List<BoardDTO> selectAllBoards();

    void insertNoticeBoardData(
            @Param("id") String email,
            @Param("board") BoardDTO boardDTO
    );

    void insertNoticeBoardImages(@Param("board") BoardDTO boardDTO);

}
