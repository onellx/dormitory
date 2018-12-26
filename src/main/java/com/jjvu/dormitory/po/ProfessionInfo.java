package com.jjvu.dormitory.po;

public class ProfessionInfo {
    private String professionId;

    private String professionName;

    private String collegeId;

    private String professionLinkman;

    private String professionTel;

    private String professionIntro;

    public String getProfessionId() {
        return professionId;
    }

    public void setProfessionId(String professionId) {
        this.professionId = professionId == null ? null : professionId.trim();
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName == null ? null : professionName.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getProfessionLinkman() {
        return professionLinkman;
    }

    public void setProfessionLinkman(String professionLinkman) {
        this.professionLinkman = professionLinkman == null ? null : professionLinkman.trim();
    }

    public String getProfessionTel() {
        return professionTel;
    }

    public void setProfessionTel(String professionTel) {
        this.professionTel = professionTel == null ? null : professionTel.trim();
    }

    public String getProfessionIntro() {
        return professionIntro;
    }

    public void setProfessionIntro(String professionIntro) {
        this.professionIntro = professionIntro == null ? null : professionIntro.trim();
    }
}