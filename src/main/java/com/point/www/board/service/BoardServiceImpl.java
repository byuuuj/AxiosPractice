package com.point.www.board.service;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;
import com.point.www.board.paging.PaginationInfo;
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
    public List<BoardDTO> list(BoardDTO dto) {

        //빈 데이터를 반환할경우 NullPointerException을 방지
        List<BoardDTO> list = Collections.emptyList();

        //리스트의 갯수
        int listCount = boardRepository.listCount(dto);

        //setTotalRecordCount 메서드에 전체 게시글 수를 담아서 페이징 정보를 계산
        //계산된 페이징 정보를 가진 paginationInfo를 dto에 담아 SELECT한 후,
        //게시글 리스트를 반환! 이렇게 하면 컨트롤러에서 PaginationInfo 객체를 따로 처리하지 않아도 됨
        PaginationInfo paginationInfo = new PaginationInfo(dto);
        paginationInfo.setTotalRecordCount(listCount);

        dto.setPaginationInfo(paginationInfo);

        //리스트 갯수 0보다 클경우 리스트 불러오기
        if(listCount > 0) {
            list = boardRepository.list(dto);
        }

        return list;
    }
    @Override
    public int listCount(BoardDTO dto){
        return boardRepository.listCount(dto);
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

    @Override
    public List<BoardDTO> fix_list(BoardDTO dto) {

        List<BoardDTO> list = boardRepository.fix_list(dto);

        return list;
    }

    @Override
    public void fix_add(BoardDTO dto) {
        boardRepository.fix_add(dto);
    }
}