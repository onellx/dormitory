package com.jjvu.dormitory.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.jjvu.dormitory.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.CollegeService;
import com.jjvu.dormitory.Service.DormInfoService;
import com.jjvu.dormitory.Service.DormroomInfoService;
import com.jjvu.dormitory.Service.RoomDistributionService;
import com.jjvu.dormitory.Service.StudentService;

@Controller
@RequestMapping("/roomDistribution")
public class RoomDistributionController {
	
	@Autowired
	private DormInfoService dormInfoService;
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private RoomDistributionService roomDistributionService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private DormroomInfoService dormroomInfoService;
//------这个方法修改了
	@RequestMapping("/roomToCollegePage")
	public ModelAndView roomToCollegePage(@RequestParam(value = "dromId",defaultValue = "0")String dromId, DormQueryVo dormQueryVo) throws Exception {
		if (!dromId.equals("0")){
			DormInfo dormInfo=new DormInfo();
			dormInfo.setDormId(dromId);
			dormQueryVo.setDormInfo(dormInfo);
		}
		DormCustom dormCustom = dormInfoService.findDormAndroomToCollege(dormQueryVo);
		List<DormCustom> dormList = dormInfoService.queryList(null);
		List<CollegeCustom> collegeList = collegeService.queryList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/roomDistribution/RoomToCollegePage");
		modelAndView.addObject("dormCustom", dormCustom);
		modelAndView.addObject("dormList", dormList);
		modelAndView.addObject("dromId", dromId);
		modelAndView.addObject("collegeList", collegeList);//学院
		return modelAndView;
	}

	@RequestMapping("/roomToCollege")
	public String roomToCollege(String[] roomIds, String collegeId) throws Exception {
		roomDistributionService.roomToCollege(roomIds, collegeId);
		return "redirect:roomToCollegePage.action";
	}
	
	@RequestMapping("/studentToRoomPage")
	public ModelAndView studentToRoomPage(HttpSession session) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		StudentQueryVo studentQueryVo = new StudentQueryVo();
		studentQueryVo.setManager(manager);
		List<StudentCustom> studentList = studentService.infoList(studentQueryVo);
		DormroomQueryVo dormroomQueryVo = new DormroomQueryVo();
		dormroomQueryVo.setManager(manager);
		List<DormroomCustom> dormroomList = dormroomInfoService.listNotFull(dormroomQueryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("studentList", studentList);
		modelAndView.addObject("dormroomList", dormroomList);
		modelAndView.setViewName("/roomDistribution/StudentToRoomPage");
		return modelAndView;
	}
	
	@RequestMapping("/studentToRoom")
	public String studnetToRoom(String[] studentIds, String roomId) throws Exception {
		roomDistributionService.studntToRoom(studentIds, roomId);
		return "redirect:studentToRoomPage.action";
	}
	
	@RequestMapping("/roomChangeOnePage")
	public ModelAndView roomChangeOnePage(HttpSession session) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		
		StudentQueryVo studentQueryVo = new StudentQueryVo();
		studentQueryVo.setManager(manager);
		List<StudentCustom> studentList = studentService.roomNotFullList(studentQueryVo);
		
		DormroomQueryVo dormroomQueryVo = new DormroomQueryVo();
		dormroomQueryVo.setManager(manager);
		List<DormroomCustom> dormroomList = dormroomInfoService.listNotFull(dormroomQueryVo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/roomDistribution/RoomChangeOnePage");
		modelAndView.addObject("studentList", studentList);
		modelAndView.addObject("dormroomList", dormroomList);
		
		return modelAndView;
	}
	
	@RequestMapping("/roomChangeOne")
	public String roomChangeOne(String studentId, String roomId) throws Exception {
		roomDistributionService.roomChangeOne(studentId, roomId);
		return "redirect:roomChangeOnePage.action";
	}
	
	@RequestMapping("/roomExChangePage")
	public ModelAndView roomExChangePage(HttpSession session) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		
		StudentQueryVo studentQueryVo = new StudentQueryVo();
		studentQueryVo.setManager(manager);
		List<StudentCustom> studentList = studentService.infoList(studentQueryVo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/roomDistribution/RoomExChangePage");
		modelAndView.addObject("studentList", studentList);
		
		return modelAndView;
	}
	
	@RequestMapping("/roomExChange")
	public String roomExChange(String[] studentIds) throws Exception {
		roomDistributionService.roomExChange(studentIds);
		return "redirect:roomExChangePage.action";
	}

	@RequestMapping(value = "/roomUpdate/{studentId}" ,method = RequestMethod.GET)
	public String roomUpdate(@PathVariable("studentId") String studentId) throws Exception {
		studentService.updateByPrimaryKey(studentId);
		return "redirect:../studentToRoomPage.action";
	}
	@RequestMapping(value = "/roomUpdate" ,method = RequestMethod.POST)
	public String roomUpdate( String[] studentIds) throws Exception {
		for(String sid:studentIds){
			studentService.updateByPrimaryKey(sid);
		}
		return "redirect:StudentEmigrationToRoomPage.action";
	}

	@RequestMapping("/StudentEmigrationToRoomPage")
	public ModelAndView roomemigration(HttpSession session) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		StudentQueryVo studentQueryVo = new StudentQueryVo();
		studentQueryVo.setManager(manager);
		List<StudentCustom> studentList = studentService.infoEmigrationList(studentQueryVo);
		DormroomQueryVo dormroomQueryVo = new DormroomQueryVo();
		dormroomQueryVo.setManager(manager);
		List<DormroomCustom> dormroomList = dormroomInfoService.listNotFull(dormroomQueryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("studentList", studentList);
		modelAndView.addObject("dormroomList", dormroomList);
		modelAndView.setViewName("/roomDistribution/StudentEmigrationToRoomPage");
		return modelAndView;
	}
	
}
