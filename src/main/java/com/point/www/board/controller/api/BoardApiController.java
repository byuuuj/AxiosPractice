package com.point.www.board.controller.api;


import com.point.www.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardApiController {
    @Autowired
    private BoardService boardService;

}