package kr.co.soft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.soft.beans.PayBean;
import kr.co.soft.beans.UserBean;
import kr.co.soft.dao.PayDao;

@Service
public class PayService {

	@Autowired
	private PayDao payDao;

	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;

	public List<PayBean> getCardList(String id) {

		return payDao.getCardList(id);
	}

	public List<PayBean> getPayAll() {

		return payDao.getPayAll();
	}

}
