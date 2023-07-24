package com.point.www.service;

import com.point.www.repository.BoardRepository;
import com.point.www.service.BoardService;
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
    public List<Map<String, Object>> listBoard() {
        return boardRepository.listBoard();
    }

    @Override
    public List<Map<String, Object>> boardDetail(String id) {
        return boardRepository.boardDetail(id);
    }
}