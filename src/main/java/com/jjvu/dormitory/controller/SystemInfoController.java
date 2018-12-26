package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.SystemInfoService;
import com.jjvu.dormitory.po.SystemInfo;

@Controller
@RequestMapping("/systemInfo")
public class SystemInfoController {
	
	@Autowired
	private SystemInfoService systemInfoService;
	
	@RequestMapping("/systemInfoList")
	public ModelAndView systemInfoList() throws Exception {
		List<SystemInfo> systemList = systemInfoService.queryList();
		return new ModelAndView("/systemInfo/admin/SystemQueryList", "systemList", systemList);
	}
	
	@RequestMapping("/findSystemInfo")
	public ModelAndView findSystemInfo(Integer systemId) throws Exception{
		SystemInfo systemInfo = systemInfoService.findById(systemId);
		return new ModelAndView("/systemInfo/admin/SystemInfo", "systemInfo", systemInfo);
	};
	
	@RequestMapping("/systemInfoSave")
	public String systemInfoSave(SystemInfo systemInfo) throws Exception{
		int systemId = systemInfoService.saveSystemInfo(systemInfo);
		return "redirect:findSystemInfo.action?systemId="+systemId;
	};
	
	@RequestMapping("/systemInfoUpdate")
	public String systemInfoUpdate(Integer systemId, SystemInfo systemInfo) throws Exception{
		systemInfoService.updateSystemInfo(systemId, systemInfo);
		return "redirect:findSystemInfo.action?systemId="+systemId;
	};
	
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(Integer systemId) throws Exception {
		SystemInfo systemInfo = systemInfoService.findById(systemId);
		return new ModelAndView("/systemInfo/admin/SystemUpdate", "systemInfo", systemInfo);
	}
	
}
