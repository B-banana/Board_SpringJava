package kr.co.soft.service;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.soft.beans.ContentBean;
import kr.co.soft.beans.PageBean;
import kr.co.soft.beans.UserBean;
import kr.co.soft.dao.BoardDao;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class BoardService {

	@Value("${path.upload}")
	private String path_upload;

	// 글번호 10개씩
	@Value("${page.listcnt}")
	private int page_listcnt;

	// 글 버튼 10개씩
	@Value("${page.paginationcnt}")
	private int paginationcnt;

	@Autowired
	private BoardDao boardDao;

	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;

	private String saveUploadFile(MultipartFile upload_file) {

		// 현재시간과 오리지널 파일 네임
		// String file_name = System.currentTimeMillis() + "_" +
		// upload_file.getOriginalFilename();
		// String file_name = System.currentTimeMillis() + "_" + upload_file.getName();
		String file_name = System.currentTimeMillis() + "_"
				+ FilenameUtils.getBaseName(upload_file.getOriginalFilename()) + "."
				+ FilenameUtils.getExtension(upload_file.getOriginalFilename());

		try {
			upload_file.transferTo(new File(path_upload + "/" + file_name));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return file_name;
	}

	// =================================================================

	public void addContentInfo(ContentBean writeContentBean) {

		MultipartFile upload_file = writeContentBean.getUpload_file();

		if (upload_file.getSize() > 0) {
			String file_name = saveUploadFile(upload_file);
			System.out.println(file_name);

			// 오라클에 저장 될 파일 이름으로 활용하는 코드
			writeContentBean.setContent_file(file_name);
		}

		writeContentBean.setContent_writer_idx(loginUserBean.getUser_idx());

		boardDao.addContentInfo(writeContentBean);

	}

	public String getBoardInfoName(int board_info_idx) {

		return boardDao.getBoardInfoName(board_info_idx);
	}

	public List<ContentBean> getContentList(int board_info_idx, int page) {
		/*
		 * 페이징 처리 1 -> 0~9 2 -> 10~19 3 -> 20~29
		 */

		// start 글번호(0, 10, 20)
		int start = (page - 1) * page_listcnt;
		RowBounds rowBounds = new RowBounds(start, page_listcnt); // 10개씩 끊어줌

		return boardDao.getContentList(board_info_idx, rowBounds);
	}

	public ContentBean getContentInfo(int content_idx) {

		return boardDao.getContentInfo(content_idx);
	}

	public void modifyContentInfo(ContentBean modifyContentBean) {

		MultipartFile upload_file = modifyContentBean.getUpload_file();

		if (upload_file.getSize() > 0) { // upload_file에 해당 파일이 있다면
			String file_name = saveUploadFile(upload_file);

			modifyContentBean.setContent_file(file_name);

		}

		boardDao.modifyContentInfo(modifyContentBean);
	}

	public void deleteContentInfo(int content_idx) {

		boardDao.deleteContentInfo(content_idx);
	}

	public PageBean getContentCnt(int content_board_idx, int currentPage) {
		
		// 전체 글의 갯수
		int current_cnt = boardDao.getContentCnt(content_board_idx);
		
		PageBean pageBean = new PageBean(current_cnt, currentPage, page_listcnt, paginationcnt);
		
		return pageBean;
	}

}
