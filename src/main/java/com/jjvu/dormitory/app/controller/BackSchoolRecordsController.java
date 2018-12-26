package com.jjvu.dormitory.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.dormitory.Service.BackSchoolRecordsService;
import com.jjvu.dormitory.app.json.Return;

@Controller
@RequestMapping("/app/backSchoolRecords")
public class BackSchoolRecordsController {

	@Autowired
	private BackSchoolRecordsService backSchoolRecordsService;
	
	/**
	 * 添加返校记录
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/stBackSchooled")
	public @ResponseBody Return stBackSchooled(String identifying) {
		
		Return return1 = new Return();
		
		if(backSchoolRecordsService.
				stBackSchooled(identifying)) {
			return1.setIdentifying("1");
		}else {
			return1 = null;
		}
		
		return return1;
		
	}
	
	
}
