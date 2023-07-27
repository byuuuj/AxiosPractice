package com.point.www.board.service;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;
import com.point.www.board.repository.BoardRepository;
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
    public List<Map<String, Object>> list(Criteria criteria) {
        return boardRepository.list(criteria);
    }
    @Override
    public int listCount(Criteria criteria){
        return boardRepository.listCount(criteria);
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