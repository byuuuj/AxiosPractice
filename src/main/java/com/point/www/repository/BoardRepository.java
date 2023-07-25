package com.point.www.repository;

import com.point.www.dto.boardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BoardRepository {
    List<Map<String, Object>> getBoards();

    List<Map<String, Object>> list();

    Map<String, Object> detail(Long id);

    public void add(boardDTO boarddto);
}
