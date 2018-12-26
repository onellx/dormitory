package com.jjvu.dormitory.po;

public class StudentsAppInfo {
    private String studentsAppId;

    private String studentExamNum;

    private String studentAppHeard;

    private String studentAppPasswd;

    private String studentAppPhone;

    private String studentsFaceCode;

    private String studentsAppState;

    private String appChangeTime;

    public String getStudentsAppId() {
        return studentsAppId;
    }

    public void setStudentsAppId(String studentsAppId) {
        this.studentsAppId = studentsAppId == null ? null : studentsAppId.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getStudentAppHeard() {
        return studentAppHeard;
    }

    public void setStudentAppHeard(String studentAppHeard) {
        this.studentAppHeard = studentAppHeard == null ? null : studentAppHeard.trim();
    }

    public String getStudentAppPasswd() {
        return studentAppPasswd;
    }

    public void setStudentAppPasswd(String studentAppPasswd) {
        this.studentAppPasswd = studentAppPasswd == null ? null : studentAppPasswd.trim();
    }

    public String getStudentAppPhone() {
        return studentAppPhone;
    }

    public void setStudentAppPhone(String studentAppPhone) {
        this.studentAppPhone = studentAppPhone == null ? null : studentAppPhone.trim();
    }

    public String getStudentsFaceCode() {
        return studentsFaceCode;
    }

    public void setStudentsFaceCode(String studentsFaceCode) {
        this.studentsFaceCode = studentsFaceCode == null ? null : studentsFaceCode.trim();
    }

    public String getStudentsAppState() {
        return studentsAppState;
    }

    public void setStudentsAppState(String studentsAppState) {
        this.studentsAppState = studentsAppState == null ? null : studentsAppState.trim();
    }

    public String getAppChangeTime() {
        return appChangeTime;
    }

    public void setAppChangeTime(String appChangeTime) {
        this.appChangeTime = appChangeTime == null ? null : appChangeTime.trim();
    }
}