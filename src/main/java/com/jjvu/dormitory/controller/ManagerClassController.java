package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.MaclassModuleService;
import com.jjvu.dormitory.Service.ManagerClassService;
import com.jjvu.dormitory.Service.ModuleService;
import com.jjvu.dormitory.po.MaclassModuleCustom;
import com.jjvu.dormitory.po.MaclassModuleInfo;
import com.jjvu.dormitory.po.ManagerClass;
import com.jjvu.dormitory.po.ManagerClassCustom;
import com.jjvu.dormitory.po.ModuleCustom;

@Controller
@RequestMapping("/managerClass")
public class ManagerClassController {
	
	@Autowired
	private ManagerClassService managerClassService;
	@Autowired
	private MaclassModuleService maclassModuleService;
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping("/managerClassList")
	public ModelAndView managerClassList() throws Exception {
		List<ManagerClass> managerClassList = managerClassService.queryList();
		return new ModelAndView("/managerClass/admin/ManagerClassQueryList","managerClassList", managerClassList);
	}
	
	@RequestMapping("/findManagerClassInfo")
	public ModelAndView findManagerClassInfo(int managerClassId) throws Exception{
		ManagerClass managerClass = managerClassService.findById(managerClassId);
		return new ModelAndView("/managerClass/admin/ManagerClassInfo","managerClass", managerClass);
	};
	
	@RequestMapping("/managerClassSave")
	public String managerClassSave(ManagerClass managerClass) throws Exception{
		managerClassService.saveManager(managerClass);
		return "redirect:managerClassList.action";
	};
	
	@RequestMapping("/managerClassUpdate")
	public String managerClassUpdate(ManagerClass managerClass) throws Exception{
		managerClassService.updateInfo(managerClass.getManagerClassId(), managerClass);
		return "redirect:findManagerClassInfo.action?managerClassId="+managerClass.getManagerClassId();
	};
	
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(int managerClassId) throws Exception {
		ManagerClass managerClass = managerClassService.findById(managerClassId);
		return new ModelAndView("/managerClass/admin/ManagerClassUpdate","managerClass", managerClass);
	}
	
	//管理员类和模块关系的管理
	/**
	 * 管理员类和模块的关系列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/managerClassModuleList")
	public ModelAndView managerClassModuleList() throws Exception {
		List<ManagerClassCustom> managerClassModuleList = managerClassService.findManagerClassModule();
		return new ModelAndView("/managerClass/admin/classModule/ManagerClassModuleQueryList","managerClassModuleList", managerClassModuleList);
	}
	
	/**
	 * 根据管理员类ID查询该ID所有的模块信息
	 * @param managerClassId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findClassMoudleByMid")
	public ModelAndView findClassMoudleByMid(Integer managerClassId) throws Exception {
		List<MaclassModuleCustom> maclassModuleCustomList = maclassModuleService.findMaclassModule(managerClassId);
		ManagerClass managerClass = managerClassService.findById(managerClassId);
		List<ModuleCustom> moduleList = moduleService.findAvailable();
		ModelAndView modelAndView = new ModelAndView("/managerClass/admin/classModule/ManagerClassModule","maclassModuleCustomList", maclassModuleCustomList);
		modelAndView.addObject("managerClass", managerClass);
		modelAndView.addObject("moduleList", moduleList);
		return modelAndView;
	}
	
	/**
	 * 根据mmId解除这一条类和模块的关系
	 * @param mmId
	 * @return 返回这个类别的模块列表
	 * @throws Exception
	 */
	@RequestMapping("/removeClassModule")
	public String removeClassModule(Integer mmId) throws Exception {
		Integer managerClassId = maclassModuleService.deleteRelation(mmId);
		return "redirect:findClassMoudleByMid.action?managerClassId="+managerClassId;
	}
	
	/**
	 * 
	 * @param mmId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveClassModule")
	public String saveClassModule(MaclassModuleInfo maclassModuleInfo) throws Exception {
		maclassModuleService.insertRelation(maclassModuleInfo);
		return "redirect:findClassMoudleByMid.action?managerClassId="+maclassModuleInfo.getManagerClassId();
	}

}
