package com.jjvu.dormitory.po;

public class LeaveSchoolRecords {
    private String leaveRecodesId;

    private String studentExamNum;

    private String leaveRecodesTime;

    private String leaveRecodesState;

    public String getLeaveRecodesId() {
        return leaveRecodesId;
    }

    public void setLeaveRecodesId(String leaveRecodesId) {
        this.leaveRecodesId = leaveRecodesId == null ? null : leaveRecodesId.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getLeaveRecodesTime() {
        return leaveRecodesTime;
    }

    public void setLeaveRecodesTime(String leaveRecodesTime) {
        this.leaveRecodesTime = leaveRecodesTime == null ? null : leaveRecodesTime.trim();
    }

    public String getLeaveRecodesState() {
        return leaveRecodesState;
    }

    public void setLeaveRecodesState(String leaveRecodesState) {
        this.leaveRecodesState = leaveRecodesState == null ? null : leaveRecodesState.trim();
    }
}