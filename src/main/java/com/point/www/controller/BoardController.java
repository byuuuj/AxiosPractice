package com.point.www.controller;

import com.point.www.dto.boardDTO;
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
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    //jsp연결 테스트
    @GetMapping("/list_jsp")
    public String getBoards() {
        return "test";
    }


    // 타임리프 테스트 리스트
    @GetMapping("/")
    public String list(Model model) {
        List<Map<String, Object>> list = boardService.list();
        model.addAttribute("boards" , list);

        return "index";
    }


    //타임리프 테스트 상세페이지
    @GetMapping("/{id}")
    public String detail(Model model , @PathVariable("id") Long id) {
        //상세는 list로 받아올 필요없음
        model.addAttribute("board" , boardService.detail(id));

        return "detail";
    }


    //타임리프 테스트 등록폼으로 이동
    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("boarddto",new boardDTO());
        return "addForm";
    }
}
