package com.point.www.board.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO extends CommonDTO {
    private Long id;
    private String name;
    private String title;
}
