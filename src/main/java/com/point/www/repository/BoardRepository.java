package com.point.www.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BoardRepository {
    List<Map<String, Object>> getBoards();

    List<Map<String, Object>> listBoard();

    List<Map<String, Object>> boardDetail(String id);
}
