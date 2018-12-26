package com.jjvu.dormitory.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.ManagerService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.Manager;

@Controller
@RequestMapping("/app/manager")
public class ManagerAppController {

	@Autowired
	private ManagerService managerService;
	
	/**
	 * 手机app管理员登录
	 * @param Account
	 * @param Passwd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/managerLogin")
	public @ResponseBody Return managerAppLogin(String Account, String Passwd) throws Exception {
		
		Return return1 = new Return();
		
		Manager manager = new Manager();
		manager.setManagerName(Account);
		manager.setManagerPasswd(Passwd);
		
		Manager cleckManager = managerService.loginCheck(manager);
		
		if(cleckManager != null) {
			return1.setIdentifying(String.valueOf(cleckManager.getManagerId()));
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	
}
