package com.jjvu.dormitory.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.DormInfoService;
import com.jjvu.dormitory.Service.DormroomInfoService;
import com.jjvu.dormitory.po.DormCustom;
import com.jjvu.dormitory.po.DormroomCustom;
import com.jjvu.dormitory.po.DormroomInfo;
import com.jjvu.dormitory.po.DormroomQueryVo;
import com.jjvu.dormitory.po.Manager;


@Controller
@RequestMapping("/dormroom")
public class DormroomInfoController {
	
	@Autowired
	private DormroomInfoService dormroomInfoService;
	@Autowired
	private DormInfoService dormInfoService;
	
	/**
	 * 跳转到房间生成页面
	 * /dormroom/dormroomSavepage.action
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormroomSavepage")
	public ModelAndView dormroomSavepage() throws Exception{
		List<DormCustom> dormList = dormInfoService.queryList(null);
		System.out.println(dormList.size());
		return new ModelAndView("/dormroom/admin/DormroomSave", "dormList", dormList);
	}
	
	/**
	 * 自动生成房间
	 * /dormroom/dormroomAutoSave.action
	 * @param dormroomInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormroomAutoSave")
	public String dormroomAutoSave(DormroomInfo dormroomInfo) throws Exception{
		DormCustom dormCustom = dormInfoService.findById(dormroomInfo.getDormId());
		dormroomInfoService.autoRoom(dormroomInfo,dormCustom);
		return "redirect:dormroomList.action";
	}
	
	/**
	 * 房间列表
	 * /dormroom/dormroomList.action
	 * @param dormroomQueryVo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormroomList")
	public ModelAndView dormroomList(HttpSession session, DormroomQueryVo dormroomQueryVo) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		dormroomQueryVo.setManager(manager);
		List<DormroomCustom> dormroomList = dormroomInfoService.queryList(dormroomQueryVo);
		return new ModelAndView("/dormroom/admin/DormroomQueryList", "dormroomList", dormroomList);
	}



	/**
	 * 房间信息
	 * /dormroom/findDormroomInfo.action
	 * @param roomId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findDormroomInfo")
	public ModelAndView findDormroomInfo(String roomId) throws Exception{
		DormroomCustom dormroomCustom = dormroomInfoService.findById(roomId);
		return new ModelAndView("/dormroom/admin/DormroomInfo", "dormroomCustom", dormroomCustom);
	}
	
	/**
	 * 资料页面跳转修改页面
	 * /dormroom/infoYoUpdate.action
	 * @param roomId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(String roomId) throws Exception {
		DormroomCustom dormroomCustom = dormroomInfoService.findById(roomId);
		return new ModelAndView("/dormroom/admin/DormroomUpdate", "dormroomCustom", dormroomCustom);
	}
	
	/**
	 * 房间资料Update
	 * /dormroom/dormroomUpdate
	 * @param dormroomInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormroomUpdate")
	public String dormroomUpdate(DormroomInfo dormroomInfo) throws Exception{
		dormroomInfoService.update(dormroomInfo.getRoomId(), dormroomInfo);
		return "redirect:dormroomList.action";
	}
	
	
}
