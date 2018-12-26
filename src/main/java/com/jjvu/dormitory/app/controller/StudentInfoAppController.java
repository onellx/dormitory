package com.jjvu.dormitory.app.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.jjvu.dormitory.Service.StudentsAppInfoService;
import com.jjvu.dormitory.app.json.Return;
import com.jjvu.dormitory.po.StudentsAppInfo;
import com.jjvu.dormitory.po.StudentsAppInfoCustom;

@Controller
@RequestMapping("/app/studentInfoApp")
public class StudentInfoAppController {
	
	@Autowired
	private StudentsAppInfoService studentsAppInfoService;
	
	
	/**
	 * 学生登录
	 * @param Account
	 * @param Passwd
	 * @return json信息，登录成功把考生号传过去，失败传NULL
	 */
	@RequestMapping("/StudentLogin")
	public @ResponseBody Return StudentLogin(String Account, String Passwd) {
		
		Return return1 = new Return();
		
		StudentsAppInfo studentsAppInfo = studentsAppInfoService.Login(Account, Passwd);
		if(studentsAppInfo != null) {
			String str = studentsAppInfo.getStudentExamNum();
			return1.setIdentifying(str);
		}else {
			return1 = null;
		}
		return return1;
	}
	
	/**
	 * 查询学生信息
	 * @param identifying
	 * @return 查询成功传递学生信息的json数据
	 */
	@RequestMapping("/stInfo")
	public @ResponseBody StudentsAppInfoCustom stInfo(String identifying) {
		
		StudentsAppInfoCustom studentsAppInfoCustom
			= studentsAppInfoService.StAppInfoCustom(identifying);
		if(studentsAppInfoCustom != null) {
			return studentsAppInfoCustom;
		}
		return null;
	}
	
	/**
	 * Update学生帐号信息
	 * @param request
	 * @param studentsAppInfo
	 * @param file
	 * @param identifying
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping(value="/stUpdate",method=RequestMethod.POST)
	public @ResponseBody Return stUpdate(HttpServletRequest request, 
					@RequestParam(value="stappInfo",required=false)String stappInfo,String identifying) 
					throws IllegalStateException, IOException {
		
		Return return1 = new Return();
		MultipartFile file=null;
		String basePath=null;
		StudentsAppInfo it=new StudentsAppInfo();
		if(stappInfo!=null){
			try {
				stappInfo=URLDecoder.decode(stappInfo,"utf-8");
			} catch (UnsupportedEncodingException e) {
			}
			
			it=JSON.parseObject(stappInfo,StudentsAppInfo.class);
			
		}
		//上传图片	
		if(request instanceof MultipartHttpServletRequest) {
			file = ((MultipartHttpServletRequest)request).getFile("file");
				//图片文件夹的绝对路径
			 basePath= request.getServletContext().getRealPath("Avatar/");
						
		}
		if(studentsAppInfoService.stAppInfoUpdate(it,identifying,basePath,file))
		{
			return1.setIdentifying("1");
		}else {
			return1=null;
		}
		
		return return1;
	}
	
	/**
	 * 检验手机号
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/checkPhone")
	public @ResponseBody Return checkPhone(String identifying) {
		
		Return return1 = new Return();
		
		StudentsAppInfo studentsAppInfo = 
				studentsAppInfoService.stAppcheckPhone(identifying);
		
		if(studentsAppInfo != null) {
			String str = studentsAppInfo.getStudentExamNum();
			return1.setIdentifying(str);
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	/**
	 * 确认学生离校
	 * @param identifying
	 * @return
	 */
	@RequestMapping("/adminStLeavSchoolAndItemsOk")
	public @ResponseBody Return adminStLeavSchoolAndItemsOk(String identifying) {
		
		Return return1 = new Return();
		
		if(studentsAppInfoService.
				stLeavSchoolAndItemsOk(identifying) == 0) {
			return1.setIdentifying("1");
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
	/**
	 * 根据管理员主键查询学生账号
	 * @param identifying 管理员主键
	 * @return
	 */
	@RequestMapping("/adminStudents")
	public @ResponseBody List<StudentsAppInfoCustom> adminStudents(String identifying) {
		
		
		List<StudentsAppInfoCustom> list=studentsAppInfoService.adminStudents(identifying);
		
		if(list != null) {
			return list;
		}else {
			return null;
		}
	}
	
	/**
	 * 检验学生密码
	 * @param identifying
	 * @param passwd
	 * @return
	 */
	@RequestMapping("/stCheckPasswd")
	public @ResponseBody Return stCheckPasswd(String identifying, String passwd) {	
		
		Return return1 = new Return();
		if(studentsAppInfoService.stCheckPasswd(identifying,passwd)) {
			return1.setIdentifying("1");
		}else {
			return1 = null;
		}
		
		return return1;
	}
	
}
