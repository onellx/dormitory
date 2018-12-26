package com.jjvu.dormitory.po;

public class CollegeInfo {
    private String collegeId;

    private String collegeName;

    private String collegeLinkman;

    private String collegeTel;

    private String collegeIntro;

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegeLinkman() {
        return collegeLinkman;
    }

    public void setCollegeLinkman(String collegeLinkman) {
        this.collegeLinkman = collegeLinkman == null ? null : collegeLinkman.trim();
    }

    public String getCollegeTel() {
        return collegeTel;
    }

    public void setCollegeTel(String collegeTel) {
        this.collegeTel = collegeTel == null ? null : collegeTel.trim();
    }

    public String getCollegeIntro() {
        return collegeIntro;
    }

    public void setCollegeIntro(String collegeIntro) {
        this.collegeIntro = collegeIntro == null ? null : collegeIntro.trim();
    }
}