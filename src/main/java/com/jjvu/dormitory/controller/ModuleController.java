package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.ModuleService;
import com.jjvu.dormitory.po.ModuleCustom;
import com.jjvu.dormitory.po.ModuleInfo;
import com.jjvu.dormitory.po.ModuleQueryVo;

@Controller
@RequestMapping("/module")
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	/**
	 * 模块列表
	 * /module/moduleList.action
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/moduleList")
	public ModelAndView moduleList(ModuleQueryVo moduleQueryVo) throws Exception {
		List<ModuleCustom> moduleList = moduleService.queryList(moduleQueryVo);
		return new ModelAndView("/module/admin/ModuleQueryList", "moduleList", moduleList);
	}
	
	/**
	 * 模块信息
	 * /module/findModuleInfo.action
	 * @param moduleId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findModuleInfo")
	public ModelAndView findModuleInfo(Integer moduleId) throws Exception{
		ModuleInfo moduleInfo = moduleService.findById(moduleId);
		return new ModelAndView("/module/admin/ModuleInfo", "moduleInfo", moduleInfo);
	};
	
	/**
	 * 资料页面转向修改页面
	 * /module/infoToupdate.action
	 * @param moduleId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(Integer moduleId) throws Exception {
		ModuleInfo moduleInfo = moduleService.findById(moduleId);
		return new ModelAndView("/module/admin/ModuleUpdate", "moduleInfo", moduleInfo);
	}
	
	/**
	 * 模块信息Update
	 * /module/moduleUpdate
	 * @param moduleInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/moduleUpdate")
	public String moduleUpdate(Integer moduleId, ModuleInfo moduleInfo) throws Exception{
		moduleService.updateInfo(moduleId, moduleInfo);
		return "redirect:findModuleInfo.action?moduleId="+moduleId;
	};
	
}
