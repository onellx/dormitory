package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.CollegeService;
import com.jjvu.dormitory.Service.ProfessionService;
import com.jjvu.dormitory.po.CollegeCustom;
import com.jjvu.dormitory.po.ProfessionCustom;
import com.jjvu.dormitory.po.ProfessionInfo;

@Controller
@RequestMapping("/profession")
public class ProfessionController {
	
	@Autowired
	private ProfessionService professionService;
	@Autowired
	private CollegeService collegeService;
	
	@RequestMapping("/professionToSave")
	public ModelAndView professionToSave() throws Exception{
		List<CollegeCustom> collegeList = collegeService.queryList();
		return new ModelAndView("/profession/admin/ProfessionSave", "collegeList", collegeList);
	};
	
	@RequestMapping("/professionList")
	public ModelAndView professionList() throws Exception {
		List<ProfessionCustom> professionList = professionService.queryList();
		for (ProfessionCustom professionCustom : professionList) {
			String collegeName = collegeService.findById(professionCustom.getCollegeId()).getCollegeName();
			professionCustom.setCollegeName(collegeName);
		}
		return new ModelAndView("/profession/admin/ProfessionQueryList", "professionList", professionList);
	}
	
	@RequestMapping("/findProfessionInfo")
	public ModelAndView findProfessionInfo(String professionId) throws Exception{
		ProfessionInfo professionInfo = professionService.findById(professionId);
		String collegeName = collegeService.findById(professionInfo.getCollegeId()).getCollegeName();
		ProfessionCustom professionCustom = new ProfessionCustom();
		BeanUtils.copyProperties(professionInfo, professionCustom);
		professionCustom.setCollegeName(collegeName);
		return new ModelAndView("/college/admin/ProfessionInfo", "professionCustom", professionCustom);
	};
	
	@RequestMapping("/professionSave")
	public String professionSave(ProfessionInfo professionInfo) throws Exception{
		String professionId = professionService.saveProfession(professionInfo);
		return "redirect:findProfessionInfo.action?professionId="+professionId;
	};
	
	@RequestMapping("/professionUpdate")
	public String professionUpdate(String professionId, ProfessionInfo professionInfo) throws Exception{
		professionService.updateInfo(professionId, professionInfo);
		return "redirect:findCollegeInfo.action?collegeId="+professionId;
	};
	
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(String professionId) throws Exception {
		ProfessionInfo professionInfo = professionService.findById(professionId);
		List<CollegeCustom> collegeList = collegeService.queryList();
		ModelAndView modelAndView = new ModelAndView("/college/admin/CollegeUpdate", "professionInfo", professionInfo);
		modelAndView.addObject("collegeList", collegeList);
		return modelAndView;
	}
	
}
