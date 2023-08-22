package com.point.www.board.controller.move.api;


import com.point.www.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardMoveApiController {
    @Autowired
    private BoardService boardService;

}