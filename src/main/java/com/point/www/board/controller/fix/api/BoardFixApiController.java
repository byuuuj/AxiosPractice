package com.point.www.board.controller.fix.api;

import com.point.www.board.dto.BoardDTO;
import com.point.www.board.service.BoardService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/fix_board")
public class BoardFixApiController {

    @Autowired
    private BoardService boardService;

    @GetMapping
    public JSONObject fix_list(@ModelAttribute("dto") BoardDTO dto) {
        JSONObject json = new JSONObject();
//
//        try {
//            json.put("list", boardService.list(dto));
//            json.put("dto" , dto);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return json;
        return null;
    }

    @PostMapping("/add")
    public BoardDTO fix_add(BoardDTO dto) {
        try {
            boardService.fix_add(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }
    @PostMapping("/update")
    public BoardDTO fix_update(BoardDTO dto) {
        try {
            boardService.fix_update(dto);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dto;
    }

    @PostMapping("/delete")
    public boolean fix_delete(BoardDTO dto) {
        boolean isDelete;
        try {
            boardService.fix_delete(dto);
            isDelete = true;

        }catch (Exception e){
            e.printStackTrace();
            isDelete = false;
        }
        return isDelete;
    }

}
