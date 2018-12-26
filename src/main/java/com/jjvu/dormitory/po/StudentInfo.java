package com.jjvu.dormitory.po;

import java.util.Date;

public class StudentInfo {
    private String studentId;

    private String studentNo;

    private String studentName;

    private String professionId;

    private Integer systemId;

    private Date studentEnterDate;

    private String studentIdcardType;

    private String studentIdcard;

    private String studentSex;

    private Date studentBirthday;

    private String studentNative;

    private String studentNation;

    private String studentTel;

    private String studentEmail;

    private String studentAddress;

    private String studentCode;

    private String studentLocal;

    private String studentExamNum;

    private String roomId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId == null ? null : professionId.trim();
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Date getStudentEnterDate() {
        return studentEnterDate;
    }

    public void setStudentEnterDate(Date studentEnterDate) {
        this.studentEnterDate = studentEnterDate;
    }

    public String getStudentIdcardType() {
        return studentIdcardType;
    }

    public void setStudentIdcardType(String studentIdcardType) {
        this.studentIdcardType = studentIdcardType == null ? null : studentIdcardType.trim();
    }

    public String getStudentIdcard() {
        return studentIdcard;
    }

    public void setStudentIdcard(String studentIdcard) {
        this.studentIdcard = studentIdcard == null ? null : studentIdcard.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentNative() {
        return studentNative;
    }

    public void setStudentNative(String studentNative) {
        this.studentNative = studentNative == null ? null : studentNative.trim();
    }

    public String getStudentNation() {
        return studentNation;
    }

    public void setStudentNation(String studentNation) {
        this.studentNation = studentNation == null ? null : studentNation.trim();
    }

    public String getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel == null ? null : studentTel.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode == null ? null : studentCode.trim();
    }

    public String getStudentLocal() {
        return studentLocal;
    }

    public void setStudentLocal(String studentLocal) {
        this.studentLocal = studentLocal == null ? null : studentLocal.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }
}