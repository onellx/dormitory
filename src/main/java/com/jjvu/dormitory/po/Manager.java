package com.jjvu.dormitory.po;

public class Manager {
    private Integer managerId;

    private Integer managerClassId;

    private String managerName;

    private String managerPasswd;

    private Integer managerState;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerClassId() {
        return managerClassId;
    }

    public void setManagerClassId(Integer managerClassId) {
        this.managerClassId = managerClassId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerPasswd() {
        return managerPasswd;
    }

    public void setManagerPasswd(String managerPasswd) {
        this.managerPasswd = managerPasswd == null ? null : managerPasswd.trim();
    }

    public Integer getManagerState() {
        return managerState;
    }

    public void setManagerState(Integer managerState) {
        this.managerState = managerState;
    }
}