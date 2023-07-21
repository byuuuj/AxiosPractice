package com.point.www.apicontroller;


import com.point.www.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/board")
public class BoardApiController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<Map<String, Object>> getBoards() {
        return boardService.getBoards();
    }
}