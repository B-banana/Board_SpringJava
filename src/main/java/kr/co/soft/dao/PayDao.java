package kr.co.soft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.soft.beans.PayBean;
import kr.co.soft.mapper.PayMapper;

@Repository
public class PayDao {
	
	@Autowired
	private PayMapper payMapper;
	
	public List<PayBean> getCardList(String id) {
		
		return payMapper.getCardList(id);
	}
	
	public List<PayBean> getPayAll() {
		
		return payMapper.getPayAll();
	}

}
