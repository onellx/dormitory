package com.jjvu.dormitory.po;

public class ModuleInfo {
    private Integer moduleId;

    private Integer moduleClassId;

    private String moduleName;

    private String moduleUrl;

    private String mostate;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getModuleClassId() {
        return moduleClassId;
    }

    public void setModuleClassId(Integer moduleClassId) {
        this.moduleClassId = moduleClassId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public String getMostate() {
        return mostate;
    }

    public void setMostate(String mostate) {
        this.mostate = mostate == null ? null : mostate.trim();
    }
}