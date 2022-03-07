package kr.co.soft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.soft.beans.ContentBean;
import kr.co.soft.mapper.BoardMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public void addContentInfo(ContentBean writeContentBean) {
		
		boardMapper.addContentInfo(writeContentBean);
	}
	
	public String getBoardInfoName(int board_info_idx) {
		
		return boardMapper.getBoardInfoName(board_info_idx);
	}
	
	public List<ContentBean> getContentList(int board_info_idx){
		
		return boardMapper.getContentList(board_info_idx);
	}
	

}
