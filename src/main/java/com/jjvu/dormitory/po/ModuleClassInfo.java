package com.jjvu.dormitory.po;

public class ModuleClassInfo {
    private Integer moduleClassId;

    private String moduleClassName;

    private String moduleIntro;

    public Integer getModuleClassId() {
        return moduleClassId;
    }

    public void setModuleClassId(Integer moduleClassId) {
        this.moduleClassId = moduleClassId;
    }

    public String getModuleClassName() {
        return moduleClassName;
    }

    public void setModuleClassName(String moduleClassName) {
        this.moduleClassName = moduleClassName == null ? null : moduleClassName.trim();
    }

    public String getModuleIntro() {
        return moduleIntro;
    }

    public void setModuleIntro(String moduleIntro) {
        this.moduleIntro = moduleIntro == null ? null : moduleIntro.trim();
    }
}