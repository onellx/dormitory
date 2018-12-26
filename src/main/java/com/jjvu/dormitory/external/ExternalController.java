package com.jjvu.dormitory.external;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.ManagerService;
import com.jjvu.dormitory.Service.StudentService;
import com.jjvu.dormitory.po.ManagerCustom;
import com.jjvu.dormitory.po.StudentCustom;

@Controller
@RequestMapping("/External")
public class ExternalController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ManagerService managerService;

	/**
	 * 通过学号查询学生信息
	 * @param studentId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/studentInfo")
	public @ResponseBody Map<String, Object> studentInfo(String studentId) throws Exception {
		
		String value = "success";
		
		Map<String, Object> map = new HashMap<>();
		
		StudentCustom studentCustom = studentService.findJsonInfoByNo(studentId);
		
		if(studentCustom == null)
			value = "error";
		
		map.put("find", value);
		map.put("student", studentCustom);
		
		return map;
		
	}
	
	/**
	 * 宿舍管理员的个人信息
	 * @param managerId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dormitoryManagerInfo")
	public @ResponseBody Map<String, Object> dormitoryManagerInfo(Integer managerId) throws Exception {
		String value = "success";
		Map<String, Object> map = new HashMap<>();
		
		ManagerCustom managerCustom = managerService.dormitoryManagerInfo(managerId);
		if(managerCustom == null)
			value = "error";
		
		map.put("find", value);
		map.put("manager", managerCustom);
		
		return map;
	}
	
	
	
}
