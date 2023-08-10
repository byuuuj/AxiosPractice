package com.point.www.board.paging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {
    /** 현재 페이지 번호 */
    private int currentPageNo;

    /** 페이지당 출력할 데이터 개수 */
    private int recordsPerPage;

    /** 화면 하단에 출력할 페이지 사이즈 */
    private int pageSize;

    //생성자
    public Criteria() {
        //현재페이지 1을 기본값
        this.currentPageNo = 1;
        //한페이지에 10개씩 보여줄것
        this.recordsPerPage = 10;
        //아래 보여지는 페이지사이즈는 5씩
        this.pageSize = 5;
    }

    //MySQL에서 LIMIT 구문의 앞부분에 사용되는 메서드
    public int getStartPage() {
        return (currentPageNo - 1) * recordsPerPage;
    }


}
