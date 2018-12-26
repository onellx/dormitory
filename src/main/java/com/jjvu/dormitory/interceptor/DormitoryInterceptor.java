package com.jjvu.dormitory.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.ModuleClassService;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ModuleClassCustom;

public class DormitoryInterceptor implements HandlerInterceptor{
	
	@Autowired
	private ModuleClassService moduleClassService;

	/**
	 * 进入handler方法之前执行的拦截器方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//用户认证
		String url = request.getRequestURI();
		if(url.indexOf("managerLogin.action") >= 0)
			return true;
		HttpSession session = request.getSession();
		Manager manager = (Manager) session.getAttribute("manager");
		if(manager != null)
			return true;
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		return false;
	}

	/**
	 * 进入handler方法之后返回modleandview之前执行的拦截器方法
	 * 可以在这里注入页面使用的统一的modle
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HttpSession session = request.getSession();
		Manager manager = (Manager) session.getAttribute("manager");
		
		List<ModuleClassCustom> moduleForNavList = moduleClassService.moduleForNav(manager);
		
		modelAndView.addObject("moduleForNavList", moduleForNavList);
		
	}

	/**
	 * 进入handler方法之后执行的拦截器方法
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
