package com.point.www.service;

import com.point.www.dto.BoardDTO;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String, Object>> getBoards();

    List<Map<String, Object>> list();

    Map<String, Object> detail(Long id);

    public void add(BoardDTO dto);

    public void edit(BoardDTO dto);

    public void delete(Long id);
}
