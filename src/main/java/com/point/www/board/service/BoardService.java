package com.point.www.board.service;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<BoardDTO> list(BoardDTO dto);

    public int listCount(BoardDTO dto);

    Map<String, Object> detail(Long id);

    public void add(BoardDTO dto);

    public void edit(BoardDTO dto);

    public void delete(Long id);

    List<BoardDTO> fix_list(BoardDTO dto);

    public void fix_add(BoardDTO dto);
}
