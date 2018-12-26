package com.jjvu.dormitory.po;

import java.util.Date;

public class StudentsAppInfoCustom {
     private String studentExamNum;//高考号
	 private String studentAppHeard;
	 private String studentName;//姓名
	 private String studentSex;//性别
	 private Date studentBirthday;//出生年月
	 private String studentIdcardType;//证件类型
	 private String studentIdcard;//证件号码
	 private String studentAppPhone;//手机号
	 private String dormName;//楼号
	 private String roomNum;//房间号
	 private String leaveOrStay;//是否在校
	 
	public String getStudentExamNum() {
		return studentExamNum;
	}
	public void setStudentExamNum(String studentExamNum) {
		this.studentExamNum = studentExamNum;
	}
	public String getStudentAppHeard() {
		return studentAppHeard;
	}
	public void setStudentAppHeard(String studentAppHeard) {
		this.studentAppHeard = studentAppHeard;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
	public Date getStudentBirthday() {
		return studentBirthday;
	}
	public void setStudentBirthday(Date studentBirthday) {
		this.studentBirthday = studentBirthday;
	}
	public String getStudentIdcardType() {
		return studentIdcardType;
	}
	public void setStudentIdcardType(String studentIdcardType) {
		this.studentIdcardType = studentIdcardType;
	}
	public String getStudentIdcard() {
		return studentIdcard;
	}
	public void setStudentIdcard(String studentIdcard) {
		this.studentIdcard = studentIdcard;
	}
	public String getStudentAppPhone() {
		return studentAppPhone;
	}
	public void setStudentAppPhone(String studentAppPhone) {
		this.studentAppPhone = studentAppPhone;
	}
	public String getDormName() {
		return dormName;
	}
	public void setDormName(String dormName) {
		this.dormName = dormName;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getLeaveOrStay() {
		return leaveOrStay;
	}
	public void setLeaveOrStay(String leaveOrStay) {
		this.leaveOrStay = leaveOrStay;
	}
	@Override
	public String toString() {
		return "StudentsAppInfoCustom [studentExamNum=" + studentExamNum + ", studentAppHeard=" + studentAppHeard
				+ ", studentName=" + studentName + ", studentSex=" + studentSex + ", studentBirthday=" + studentBirthday
				+ ", studentIdcardType=" + studentIdcardType + ", studentIdcard=" + studentIdcard + ", studentAppPhone="
				+ studentAppPhone + ", dormName=" + dormName + ", roomNum=" + roomNum + ", leaveOrStay=" + leaveOrStay
				+ "]";
	}
	

}
