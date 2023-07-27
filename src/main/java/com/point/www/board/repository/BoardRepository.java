package com.point.www.board.repository;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BoardRepository {
    List<Map<String, Object>> getBoards();

    List<Map<String, Object>> list(Criteria criteria);
    public int listCount(Criteria criteria);

    Map<String, Object> detail(Long id);

    public void add(BoardDTO dto);

    public void edit(BoardDTO dto);

    public void delete(Long id);
}
