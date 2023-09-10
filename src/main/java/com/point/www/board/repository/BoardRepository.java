package com.point.www.board.repository;

import com.point.www.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BoardRepository {
    List<BoardDTO> list(BoardDTO dto);
    public int listCount(BoardDTO dto);

    Map<String, Object> detail(Long id);

    public void add(BoardDTO dto);

    public void edit(BoardDTO dto);

    public void delete(Long id);

    List<BoardDTO> fix_list(BoardDTO dto);

    public void fix_add(BoardDTO dto);
    public void fix_update(BoardDTO dto);
    public void fix_delete(BoardDTO dto);
}
