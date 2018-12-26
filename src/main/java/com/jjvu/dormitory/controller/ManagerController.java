package com.jjvu.dormitory.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.ManagerClassService;
import com.jjvu.dormitory.Service.ManagerService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.ManagerClass;
import com.jjvu.dormitory.po.ManagerCustom;
import com.jjvu.dormitory.po.ManagerQueryVo;


@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	@Autowired
	private ManagerClassService managerClassService;
	
	@RequestMapping("/managerLogin")
	public String managerLogin(HttpSession session, Manager manager) throws Exception{
		Manager cleckManager = managerService.loginCheck(manager);
		if(cleckManager == null) {
			return "/login";
		} else {
			session.setAttribute("manager", cleckManager);
			return "/backstageIndex";
		}
		
	}
	
	/**
	 * 手机app管理员登录
	 * @param Account
	 * @param Passwd
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("null")
	@RequestMapping("/managerAppLogin")
	public @ResponseBody Return managerAppLogin(String Account, String Passwd) throws Exception {
		
		Return return1 = new Return();
		
		Manager manager = new Manager();
		manager.setManagerName(Account);
		manager.setManagerPasswd(Passwd);
		
		Manager cleckManager = managerService.loginCheck(manager);
		
		if(cleckManager == null) {
			return1.setIdentifying(String.valueOf(cleckManager.getManagerId()));
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	@RequestMapping("/managerToSave")
	public ModelAndView managerToSave() throws Exception{
		List<ManagerClass> managerClassList = managerClassService.queryList();
		return new ModelAndView("/manager/admin/ManagerSave","managerClassList",managerClassList);
	}
	
	@RequestMapping("/managerSave")
	public String managerSave(Manager manager) throws Exception{
		int mId = managerService.saveManager(manager);
		return "redirect: findManagerInfo.action?managerId="+mId;
	}
	
	@RequestMapping("/managerList")
	public ModelAndView managerList(ManagerQueryVo managerQueryVo) throws Exception {
		List<ManagerCustom> Managerlist = managerService.QueryList(managerQueryVo);
		List<ManagerClass> managerClasslist = managerClassService.queryList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Managerlist", Managerlist);
		modelAndView.addObject("managerClasslist", managerClasslist);
		modelAndView.setViewName("/manager/admin/ManagerQueryList");
		return modelAndView;
	}
	
	@RequestMapping("/findManagerInfo")
	public ModelAndView findManagerInfo(Integer managerId) throws Exception{
		ManagerCustom managerCustom = managerService.findById(managerId);
		return new ModelAndView("/manager/admin/ManagerInfo","managerCustom",managerCustom);
	}
	
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(Integer managerId) throws Exception {
		ManagerCustom managerCustom = managerService.findById(managerId);
		List<ManagerClass> managerClassList = managerClassService.queryList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("managerCustom",managerCustom);
		modelAndView.addObject("managerClassList", managerClassList);
		modelAndView.setViewName("/manager/admin/ManagerUpdate");
		return modelAndView;
	}
	
	@RequestMapping("/managerUpdate")
	public String managerUpdate(ManagerCustom managerCustom) throws Exception{
		managerService.updateInfo(managerCustom.getManagerId(), managerCustom);
		return "redirect: findManagerInfo.action?managerId="+managerCustom.getManagerId();
	}
	
	
}
