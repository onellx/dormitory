package com.jjvu.dormitory.po;

public class BackSchoolRecords {
    private String backRecodesId;

    private String studentExamNum;

    private String backRecodesTime;

    private String backRecodesState;

    public String getBackRecodesId() {
        return backRecodesId;
    }

    public void setBackRecodesId(String backRecodesId) {
        this.backRecodesId = backRecodesId == null ? null : backRecodesId.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getBackRecodesTime() {
        return backRecodesTime;
    }

    public void setBackRecodesTime(String backRecodesTime) {
        this.backRecodesTime = backRecodesTime == null ? null : backRecodesTime.trim();
    }

    public String getBackRecodesState() {
        return backRecodesState;
    }

    public void setBackRecodesState(String backRecodesState) {
        this.backRecodesState = backRecodesState == null ? null : backRecodesState.trim();
    }
}