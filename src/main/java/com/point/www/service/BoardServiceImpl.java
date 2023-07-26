package com.point.www.service;

import com.point.www.dto.BoardDTO;
import com.point.www.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Map<String, Object>> getBoards() {
        return boardRepository.getBoards();
    }

    @Override
    public List<Map<String, Object>> list() {
        return boardRepository.list();
    }

    @Override
    public Map<String, Object> detail(Long id) {
        return boardRepository.detail(id);
    }

    @Override
    public void add(BoardDTO dto) {
        boardRepository.add(dto);
    }

    @Override
    public void edit(BoardDTO dto) {
        boardRepository.edit(dto);
    }

    @Override
    public void delete(Long id) {
        boardRepository.delete(id);
    }
}