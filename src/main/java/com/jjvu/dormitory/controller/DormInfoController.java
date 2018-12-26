package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.DormInfoService;
import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormQueryVo;


@Controller
@RequestMapping("/dorm")
public class DormInfoController {
	
	@Autowired
	private DormInfoService dormInfoService;
	
	/**
	 * 宿舍楼列表
	 * /dorm/dormList.action
	 * @param dormQueryVo
	 * @return DormQueryList - DormInfoList
	 * @throws Exception
	 */
	@RequestMapping("/dormList")
	public ModelAndView dormList(DormQueryVo dormQueryVo) throws Exception {
		List<DormCustom> list = dormInfoService.queryList(dormQueryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("DormInfoList", list);
		modelAndView.setViewName("/dorm/admin/DormQueryList");
		return modelAndView;
	}
	
	/**
	 * 单个宿舍楼信息
	 * /dorm/findDormInfo.action
	 * @param dormId
	 * @return DormInfo.jsp - dormCustom
	 * @throws Exception
	 */
	@RequestMapping("/findDormInfo")
	public ModelAndView findDormInfo(String dormId) throws Exception{
		DormCustom dormCustom = dormInfoService.findById(dormId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dormCustom", dormCustom);
		modelAndView.setViewName("/dorm/admin/DormInfo");
		return modelAndView;
	};
	
	/**
	 * 确认单个宿舍楼信息
	 * /dorm/findDormInfo.action
	 * @param dormId
	 * @return DormInfo.jsp - dormCustom
	 * @throws Exception
	 */
	@RequestMapping("/refreseDormInfo")
	public ModelAndView refreseDormInfo(String dormId) throws Exception{
		DormCustom dormCustom = dormInfoService.findById(dormId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dormCustom", dormCustom);
		modelAndView.setViewName("/dorm/admin/DormUpdateAuto");
		return modelAndView;
	};
	/**
	 * 增加宿舍楼
	 * 跳转到增加的宿舍楼资料页面
	 * /dorm/dormSave.action
	 * @param dormCustom
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping("/dormSave")
	public String dormSave(DormCustom dormCustom) throws Exception{

		dormInfoService.saveDorm(dormCustom);
		return "redirect: refreseDormInfo.action?dormId="+dormCustom.getDormId();
	};
	
	/**
	 * 宿舍楼资料Update
	 * /dorm/dormUpdate.action
	 * 跳转到这个宿舍楼的资料页面
	 * @param dormCustom
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormUpdate")
	public String dormUpdate(DormCustom dormCustom) throws Exception{
		dormInfoService.updateInfo(dormCustom.getDormId(), dormCustom);
		return "redirect: findDormInfo.action?dormId="+dormCustom.getDormId();
	};
	
	/**
	 * 资料页面跳转修改页面
	 * /dorm/infoToUpdate.action
	 * @param dormId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(String dormId) throws Exception {
		DormCustom dormCustom = dormInfoService.findById(dormId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("dormCustom", dormCustom);
		modelAndView.setViewName("/dorm/admin/DormUpdate");
		return modelAndView;
	}
	
	

}
