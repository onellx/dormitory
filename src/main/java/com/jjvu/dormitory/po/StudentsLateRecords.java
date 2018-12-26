package com.jjvu.dormitory.po;

public class StudentsLateRecords {
    private String lateRecordsId;

    private String studentExamNum;

    private String itemsRecordsTime;

    private String lateRecordsState;

    public String getLateRecordsId() {
        return lateRecordsId;
    }

    public void setLateRecordsId(String lateRecordsId) {
        this.lateRecordsId = lateRecordsId == null ? null : lateRecordsId.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getItemsRecordsTime() {
        return itemsRecordsTime;
    }

    public void setItemsRecordsTime(String itemsRecordsTime) {
        this.itemsRecordsTime = itemsRecordsTime == null ? null : itemsRecordsTime.trim();
    }

    public String getLateRecordsState() {
        return lateRecordsState;
    }

    public void setLateRecordsState(String lateRecordsState) {
        this.lateRecordsState = lateRecordsState == null ? null : lateRecordsState.trim();
    }
}