package com.jjvu.dormitory.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.StudentsLateRecordsService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.StudentsLateRecords;

@Controller
@RequestMapping("/app/studentsLateRecords")
public class StudentsLateRecordsController {

	@Autowired
	private StudentsLateRecordsService studentsLateRecordsService;
	
	/**
	 * 晚归记录
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/studentlates")
	public @ResponseBody List<StudentsLateRecords> studentlates(String identifying) {
		return studentsLateRecordsService.StudentLateList(identifying);
	}
	
	/**
	 * 
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/stParty")
	public @ResponseBody Return stParty(String identifying) {
		
		Return return1 = new Return();
		if(studentsLateRecordsService.stParty(identifying)) {
			return1.setIdentifying("1");
		}else {
			return1=null;
		}
		
		return return1;
	}
	
}
