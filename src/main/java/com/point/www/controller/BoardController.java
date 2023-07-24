package com.point.www.controller;

import com.point.www.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/v1/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String getBoards() {
        return "test";
    }

    @GetMapping("/test_board")
    public String getTestBoard(Model model) {

        List<Map<String, Object>> list = boardService.listBoard();
        model.addAttribute("boards" , list);

        return "index";
    }
@GetMapping("/detail/{id}")
    public String getDetail(Model model , @PathVariable("id") String id) {

        List<Map<String, Object>> list = boardService.boardDetail(id);
        model.addAttribute("board" , list);

        return "detail";
    }
}
