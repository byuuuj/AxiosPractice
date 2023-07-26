package com.point.www.controller.api;


import com.point.www.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardApiController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    //jsp 연결 테스트
    public List<Map<String, Object>> getBoards() {
        return boardService.getBoards();
    }
}