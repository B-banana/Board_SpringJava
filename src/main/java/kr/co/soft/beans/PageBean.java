package kr.co.soft.beans;

import lombok.Getter;

@Getter
public class PageBean {
	
	//최소 페이지 번호
	private int min;
	
	//최대 페이지 번호
	private int max;
	
	//이전 버튼의 페이지 번호
	private int prevPage;
	
	//다음 버튼의 페이지 번호
	private int nextPage;
	
	//전체 페이지 갯수
	private int pageCnt;
	
	//현재 페이지 번호
	private int currentPage;
	
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationcnt) {
		// int contentCnt : 전체 글 갯수 (table), int currentPage : 현재 페이지 번호(param)
		// int contentPageCnt : 페이지당 글 번호(property), int paginationcnt : 페이지버튼 갯수 (property)
		
		this.currentPage = currentPage;
		
		// 전체 페이지 갯수
		pageCnt = contentCnt / contentPageCnt;
		// 533/10=53 페이지 & 3개이므로 1페이지가 더 필요
		if (contentCnt % contentPageCnt > 0) {
			pageCnt++;
		}
		/*
		(step 1)
		1 ~ 10 : 1(최소), 10(최대)
		11 ~ 20 : 11, 20
		21 ~ 30 : 21, 30
		(step 2)
		최대 번호는 최소에 9를 더하므로 -1을 계산해줌
		(step 3)
		페이지 당 글의 갯수로 나눔
		(step 4)
		페이지 당 글의 갯수로 다시 곱합
		(step 5)
		첫번째 페이지 오류로 +1을 해줌
		*/
		min = ((currentPage - 1) / contentPageCnt) * contentPageCnt + 1;
		max = min + (paginationcnt - 1);	// min + 9
		
		// 10개의 버튼을 다 표시할 필요가 없을 때
		// 63개의 글은 6페이지 버튼에 1개 추가되고(7), 나머지 8~10은 불필요
		if (max > pageCnt) {
			max = pageCnt;
		}
		
		prevPage = min - 1;	// 0이 나오면 비 활성화
		nextPage = max + 1;	
		
		// 마지막 페이지를 넘어가지 않도록
		if (nextPage > pageCnt) {
			nextPage = pageCnt;
		}
		
	}
}
