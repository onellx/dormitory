package com.jjvu.dormitory.po;

public class DormInfo {
    private String dormId;

    private String dormName;

    private String dormLimit;

    private String dormManager;

    private String dormManagerTel;

    private Integer floorCount;

    private Integer roomCount;

    private Integer bedCount;

    private Integer assignCount;

    private String useCondition;

    private String remark;

    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId == null ? null : dormId.trim();
    }

    public String getDormName() {
        return dormName;
    }

    public void setDormName(String dormName) {
        this.dormName = dormName == null ? null : dormName.trim();
    }

    public String getDormLimit() {
        return dormLimit;
    }

    public void setDormLimit(String dormLimit) {
        this.dormLimit = dormLimit == null ? null : dormLimit.trim();
    }

    public String getDormManager() {
        return dormManager;
    }

    public void setDormManager(String dormManager) {
        this.dormManager = dormManager == null ? null : dormManager.trim();
    }

    public String getDormManagerTel() {
        return dormManagerTel;
    }

    public void setDormManagerTel(String dormManagerTel) {
        this.dormManagerTel = dormManagerTel == null ? null : dormManagerTel.trim();
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getBedCount() {
        return bedCount;
    }

    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    public Integer getAssignCount() {
        return assignCount;
    }

    public void setAssignCount(Integer assignCount) {
        this.assignCount = assignCount;
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition == null ? null : useCondition.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}