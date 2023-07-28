package com.point.www.board.controller;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.paging.Criteria;
import com.point.www.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 리스트
    @GetMapping
    public String list(Model model, @ModelAttribute("criteria") Criteria criteria) {

        List<Map<String, Object>> list = boardService.list(criteria);
        model.addAttribute("board" , list);

        return "index";
    }


    //상세페이지
    @GetMapping("/{id}")
    public String detail(Model model , @PathVariable("id") Long id) {
        //상세는 list로 받아올 필요없음
        model.addAttribute("board" , boardService.detail(id));

        return "detail";
    }


    //등록폼으로 이동
    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("dto",new BoardDTO());
        return "addForm";
    }


    // 등록
    @PostMapping("/add")
    public String addBoard( @ModelAttribute BoardDTO dto) {

        boardService.add(dto);

        return "redirect:/board/";
    }


    // 수정폼으로 이동
    @GetMapping("/{id}/edit")
    public String edit(Model model , @PathVariable("id") Long id) {

        model.addAttribute("board" , boardService.detail(id));

        return "editForm";
    }

    // 수정
    @PostMapping("/{id}/edit")
    public String editBoard(@ModelAttribute BoardDTO dto , @PathVariable("id") Long id ) {

        boardService.edit(dto);

        return "redirect:/board/{id}";
    }

    // 삭제
    @RequestMapping("/{id}/delete")
    public String delet( @PathVariable("id") Long id ) {

        boardService.delete(id);

        return "redirect:/board/";
    }
}
