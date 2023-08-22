package com.point.www.board.controller.fix.api;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/api/fix_board")
public class BoardFixApiController {

    @Autowired
    private BoardService boardService;

    @GetMapping
    public ModelAndView fix_list(@ModelAttribute("dto") BoardDTO dto, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();

        try {
            List<BoardDTO> list = boardService.fix_list(dto);
            mav.addObject("lsit" ,list);

        }catch (Exception e){
            e.printStackTrace();
        }
        return mav;
    }

}
