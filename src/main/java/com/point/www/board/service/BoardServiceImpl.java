package com.point.www.board.service;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;
import com.point.www.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;
    @Override
    public List<BoardDTO> list(Criteria criteria) {

        //빈 데이터를 반환할경우 NullPointerException을 방지
        List<BoardDTO> list = Collections.emptyList();

        //리스트의 갯수
        int listCount = boardRepository.listCount(criteria);

        //리스트 갯수 0보다 클경우 리스트 불러오기
        if(listCount > 0) {
            list = boardRepository.list(criteria);
        }

        return list;
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