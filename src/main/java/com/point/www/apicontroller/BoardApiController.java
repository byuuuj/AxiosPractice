package com.point.www.apicontroller;


import com.point.www.dto.boardDTO;
import com.point.www.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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


    // 타임리프 테스트 게시판 등록
    @PostMapping("/add")
    public String addBoard(RedirectAttributes redirectAttributes, @ModelAttribute boardDTO boarddto) {

        boardService.add(boarddto);

        return "redirect:/board/";
    }
}