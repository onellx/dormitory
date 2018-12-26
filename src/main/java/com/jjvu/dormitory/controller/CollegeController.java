package com.jjvu.dormitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.CollegeService;
import com.jjvu.dormitory.po.CollegeCustom;
import com.jjvu.dormitory.po.CollegeInfo;

@Controller
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	/**
	 * 学院列表
	 * /college/collegeList.action
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collegeList")
	public ModelAndView collegeList() throws Exception {
		List<CollegeCustom> collegeList = collegeService.queryList();
		return new ModelAndView("/college/admin/CollegeQueryList", "collegeList", collegeList);
	}
	
	/**
	 * 单个学院信息
	 * /college/findCollegeInfo.action
	 * @param collegeId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findCollegeInfo")
	public ModelAndView findCollegeInfo(String collegeId) throws Exception{
		CollegeInfo collegeInfo = collegeService.findById(collegeId);
		return new ModelAndView("/college/admin/CollegeInfo", "collegeInfo", collegeInfo);
	};
	
	/**
	 * 增加学院
	 * /college/collegeSave
	 * @param collegeInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collegeSave")
	public String collegeSave(CollegeInfo collegeInfo) throws Exception{
		String collegeId = collegeService.saveCollege(collegeInfo);
		return "redirect:findCollegeInfo.action?collegeId="+collegeId;
	};
	
	/**
	 * 学院信息Update
	 * /college/collegeUpdate
	 * @param collegeInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collegeUpdate")
	public String collegeUpdate(CollegeInfo collegeInfo) throws Exception{
		collegeService.updateInfo(collegeInfo.getCollegeId(), collegeInfo);
		return "redirect:findCollegeInfo.action?collegeId="+collegeInfo.getCollegeId();
	};
	
	/**
	 * 资料页面转向修改页面
	 * /college/infoToupdate.action
	 * @param collegeId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(String collegeId) throws Exception {
		CollegeInfo collegeInfo = collegeService.findById(collegeId);
		return new ModelAndView("/college/admin/CollegeUpdate", "collegeInfo", collegeInfo);
	}
	
}
