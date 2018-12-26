package com.jjvu.dormitory.po;

import javax.naming.ldap.PagedResultsControl;
import java.util.Date;

public class StudentQueryVo {
	
	private Manager manager;
	
	private StudentInfo studentInfo;
	
	private StudentCustom studentCustom;

	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public StudentCustom getStudentCustom() {
		return studentCustom;
	}

	public void setStudentCustom(StudentCustom studentCustom) {
		this.studentCustom = studentCustom;
	}


}
