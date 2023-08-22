package com.point.www.board.controller.fix;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/fix_board")
public class BoardFixController {
    @Autowired
    private BoardService boardService;
    @GetMapping
    public String fix_list(Model model, @ModelAttribute("dto") BoardDTO dto) {

        List<BoardDTO> list = boardService.fix_list(dto);
        model.addAttribute("fix_board", list);

        return "fix_index";
    }
}
