package com.jjvu.dormitory.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.LeaveSchoolRecordsService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.LeaveSchoolRecords;

@Controller
@RequestMapping("/app/leaveSchoolRecords")
public class LeaveSchoolRecordsController {

	@Autowired
	private LeaveSchoolRecordsService leaveSchoolRecordsService;
	
	/**
	 * 
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/stLeavechooled")
	public @ResponseBody Return stLeavechooled(String identifying) {
		
		Return return1 = new Return();
		
		if(leaveSchoolRecordsService.stLeavechooled(identifying)){
			return1.setIdentifying("1");		
		}else {
			return1=null;
		}
		
		return return1;
	}
	
	/**
	 * 离校记录
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/leaveschool")
	public @ResponseBody List<LeaveSchoolRecords> leaveschool(String identifying){
		List<LeaveSchoolRecords> list = 
				leaveSchoolRecordsService.LeaveSchoolList(identifying);
		if(list.size() > 0) {
			return list;
		}else {
			return null;
		}
	}
	
}
