package com.point.www.board.paging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginationInfo {
    /** 페이징 계산에 필요한 파라미터들이 담긴 클래스 */
    private Criteria criteria;

    /** 전체 데이터 개수 */
    private int totalRecordCount;

    /** 전체 페이지 개수 */
    private int totalPageCount;

    /** 페이지 리스트의 첫 페이지 번호 */
    private int firstPage;

    /** 페이지 리스트의 마지막 페이지 번호 */
    private int lastPage;

    /** SQL의 조건절에 사용되는 첫 RNUM */
    private int firstRecordIndex;

    /** SQL의 조건절에 사용되는 마지막 RNUM */
    private int lastRecordIndex;

    /** 이전 페이지 존재 여부 */
    private boolean hasPreviousPage;

    /** 다음 페이지 존재 여부 */
    private boolean hasNextPage;

    public PaginationInfo(Criteria criteria) {
        //페이징 파라미터의 현재 페이지번호가 1보다 작으면 1로 넣는다
        if (criteria.getCurrentPageNo() < 1) {
            criteria.setCurrentPageNo(1);
        }

        //페이지당 출력할 데이터 갯수가 1보다 작거나(데이터 없음) , 100보다 크면 10넣기
        if (criteria.getRecordsPerPage() < 1 || criteria.getRecordsPerPage() > 100) {
            criteria.setRecordsPerPage(10);
        }

        //하단의 보여지는 숫자가 5보다 작거나 20보다 크면 10넣기
        if (criteria.getPageSize() < 5 || criteria.getPageSize() > 20) {
            criteria.setPageSize(10);
        }

        this.criteria = criteria;
    }




}
