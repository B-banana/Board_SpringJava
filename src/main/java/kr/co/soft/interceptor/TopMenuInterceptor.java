package kr.co.soft.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.soft.beans.BoardInfoBean;
import kr.co.soft.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{
	
	//Interceptor클래스는 @Autowire를 사용 할 수 없으므로 객체 생성을 직접 구현한다.
	private TopMenuService topMenuService;
	
	public TopMenuInterceptor(TopMenuService topMenuService) {
		
		this.topMenuService = topMenuService;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		List<BoardInfoBean> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		
		return true;
	}

	
	
}
