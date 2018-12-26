package com.jjvu.dormitory.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jjvu.dormitory.Service.StudentService;
import com.jjvu.dormitory.po.Manager;
import com.jjvu.dormitory.po.StudentCustom;
import com.jjvu.dormitory.po.StudentInfo;
import com.jjvu.dormitory.po.StudentQueryVo;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/studentList")
	public ModelAndView studentList(HttpSession session, StudentQueryVo studentQueryVo) throws Exception {
		Manager manager = (Manager) session.getAttribute("manager");
		studentQueryVo.setManager(manager);
		List<StudentCustom> studentList = studentService.infoList(studentQueryVo);
		return new ModelAndView("/student/admin/StudentQueryList", "studentList", studentList);
	}
	
	@RequestMapping("/findStudentInfo")
	public ModelAndView findStudentInfo(String studentId) throws Exception{
		
		StudentCustom studentCustom = studentService.findInfoById(studentId);
		return new ModelAndView("/student/admin/StudentInfo", "studentCustom", studentCustom);
	};
	
	@RequestMapping("/studentUpdate")
	public String studentUpdate(String studentId, StudentInfo studentInfo) throws Exception{
		studentService.updateInfo(studentId, studentInfo);
		return "redirect:findStudentInfo.action?studentId="+studentId;
	};
	
	@RequestMapping("/infoToUpdate")
	public ModelAndView infoToUpdate(String studentId) throws Exception {
		StudentCustom studentCustom = studentService.findUpdateById(studentId);
		return new ModelAndView("/student/admin/StudnetUpdate", "studentCustom", studentCustom);
	}
	
	@RequestMapping("/studentSavePage")
	public ModelAndView studentSavePage(String studentId) throws Exception {
		return new ModelAndView("/student/admin/StudentSave");
	}
	
	/**
	 * 上传Excel表格文件自动导入学生信息
	 * @param file
	 * @param request
	 * @return
	 */
	@RequestMapping("/studentSave")
	public String studentSave(@RequestParam(value="excelfile")MultipartFile file,
								HttpServletRequest request) {
		
		File newFile = null;
		
		if(file != null) {
			String basePath = request.getServletContext().getRealPath("StudentExcel/");
			String originalFilename = file.getOriginalFilename();
			
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
			String nowDate = df.format(new Date());
			
			String newName = nowDate + originalFilename.substring(originalFilename.lastIndexOf("."));
			
			newFile = new File(basePath+"/"+newName);
			
			try {
				file.transferTo(newFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			studentService.studentSave(newFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:studentList.action";
	}
	
	/**
	 * 下载模板文件
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/excelDownload",produces = "application/octet-stream;charset=UTF-8")
    public ResponseEntity<byte[]> download(HttpServletResponse response,HttpServletRequest request) throws IOException {
	//        指定文件,必须是绝对路径
    	String basePath = request.getServletContext().getRealPath("StudentExcel/学生信息批量导入模板.xlsx");
    	File file = new File(basePath);
	   // File file = new File("E:/学生信息批量导入模板.xlsx");
	//        下载浏览器响应的那个文件名
	    String dfileName = "学生信息批量导入模板.xlsx";
	    String rfileName = new String(dfileName.getBytes(), "ISO-8859-1");
	//        下面开始设置HttpHeaders,使得浏览器响应下载
	    HttpHeaders headers = new HttpHeaders();
	//        设置响应方式
	    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	//        设置响应文件
	    headers.setContentDispositionFormData("attachment", rfileName);
	//        把文件以二进制形式写回
	    return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
	
}
