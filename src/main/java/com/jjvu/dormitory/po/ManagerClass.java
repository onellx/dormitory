package com.jjvu.dormitory.po;

public class ManagerClass {
    private Integer managerClassId;

    private String managerClassName;

    private String powerInfo;

    public Integer getManagerClassId() {
        return managerClassId;
    }

    public void setManagerClassId(Integer managerClassId) {
        this.managerClassId = managerClassId;
    }

    public String getManagerClassName() {
        return managerClassName;
    }

    public void setManagerClassName(String managerClassName) {
        this.managerClassName = managerClassName == null ? null : managerClassName.trim();
    }

    public String getPowerInfo() {
        return powerInfo;
    }

    public void setPowerInfo(String powerInfo) {
        this.powerInfo = powerInfo == null ? null : powerInfo.trim();
    }
}