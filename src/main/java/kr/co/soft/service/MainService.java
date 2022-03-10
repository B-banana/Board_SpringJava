package kr.co.soft.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.soft.beans.ContentBean;
import kr.co.soft.dao.BoardDao;

@Service
public class MainService {
	
	@Autowired
	private BoardDao boardDao;
	
	//게시글 5개씩 가져오기
	public List<ContentBean> getMainList(int board_info_idx) {
		
		RowBounds rowBounds = new RowBounds(0, 5);
		
		return boardDao.getContentList(board_info_idx, rowBounds);
	}

}
