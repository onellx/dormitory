package com.jjvu.dormitory.po;

public class DormroomInfo {
    private String roomId;

    private String roomNum;

    private String dormId;

    private Integer floorNum;

    private Integer roomBeds;

	private Integer roomAssignbeds;

    private String roomHead;

    private String roomTel;

    private Integer roomCharge;

    private String roomUsecondition;

    private String roomNotes;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }

    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId == null ? null : dormId.trim();
    }

    public Integer getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    public Integer getRoomBeds() {
        return roomBeds;
    }

    public void setRoomBeds(Integer roomBeds) {
        this.roomBeds = roomBeds;
    }

    public Integer getRoomAssignbeds() {
        return roomAssignbeds;
    }

    public void setRoomAssignbeds(Integer roomAssignbeds) {
        this.roomAssignbeds = roomAssignbeds;
    }

    public String getRoomHead() {
        return roomHead;
    }

    public void setRoomHead(String roomHead) {
        this.roomHead = roomHead == null ? null : roomHead.trim();
    }

    public String getRoomTel() {
        return roomTel;
    }

    public void setRoomTel(String roomTel) {
        this.roomTel = roomTel == null ? null : roomTel.trim();
    }

    public Integer getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(Integer roomCharge) {
        this.roomCharge = roomCharge;
    }

    public String getRoomUsecondition() {
        return roomUsecondition;
    }

    public void setRoomUsecondition(String roomUsecondition) {
        this.roomUsecondition = roomUsecondition == null ? null : roomUsecondition.trim();
    }

    public String getRoomNotes() {
        return roomNotes;
    }

    public void setRoomNotes(String roomNotes) {
        this.roomNotes = roomNotes == null ? null : roomNotes.trim();
    }
}