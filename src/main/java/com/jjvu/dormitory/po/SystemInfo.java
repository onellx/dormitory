package com.jjvu.dormitory.po;

public class SystemInfo {
    private Integer systemId;

    private String systemName;

    private Integer systemYears;

    private String systemInfo;

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public Integer getSystemYears() {
        return systemYears;
    }

    public void setSystemYears(Integer systemYears) {
        this.systemYears = systemYears;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo == null ? null : systemInfo.trim();
    }
}