package com.jjvu.dormitory.po;

public class CollegeRoomInfo {
    private Integer crId;

    private String collegeId;

    private String roomId;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }
}