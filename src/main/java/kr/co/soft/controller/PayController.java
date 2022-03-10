package kr.co.soft.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.soft.beans.PayBean;
import kr.co.soft.beans.UserBean;
import kr.co.soft.mapper.PayMapper;
import kr.co.soft.service.PayService;

@Controller
public class PayController {

	@Autowired
	private PayService payService;

	@Autowired
	private PayMapper payMapper;

	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;

	// ========================================

	@GetMapping("/mypay")
	public String mypay() {

		return "pay/mypay";
	}

	@GetMapping("/input_card")
	public String input_card(HttpSession session, Model model) {

		session.setAttribute("id", loginUserBean.getUser_name());
		String userid = loginUserBean.getUser_name();
		System.out.println(loginUserBean.getUser_name());
		model.addAttribute("userid", userid);

		return "pay/input_card";
	}

	@GetMapping("/kakaopay")
	public String kakaopay() {

		return "pay/kakaopay";
	}

	@PostMapping("/input_pro")
	public String input_pro(PayBean databean) {

		payMapper.insert_into(databean);

		return "pay/input_pro";
	}

	@GetMapping("/read_data")
	public String read_data(Model model) {
		
		List<PayBean> list = payMapper.select_data();
		model.addAttribute("list", list);

		return "pay/read_data";
	}
	
	@GetMapping("/mypay_list")
	public String pay(Model model) {
	
		List<PayBean> payList=payService.getPayAll();
		model.addAttribute("payList", payList);
		
		return "pay/mypay_list";
	}

}
