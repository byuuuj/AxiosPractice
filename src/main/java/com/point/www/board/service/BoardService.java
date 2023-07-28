package com.point.www.board.service;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String, Object>> list(Criteria criteria);

    public int listCount(Criteria criteria);

    Map<String, Object> detail(Long id);

    public void add(BoardDTO dto);

    public void edit(BoardDTO dto);

    public void delete(Long id);
}
