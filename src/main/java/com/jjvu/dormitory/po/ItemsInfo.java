package com.jjvu.dormitory.po;

public class ItemsInfo {
    private String itemsInfoId;

    private String itemsInfoName;

    private String studentExamNum;

    private String itemsInfoCategory;

    private String computerMac;

    private String itemsInfoImage;

    private String itemsInfoDescribe;

    private String itemsReview;

    private String itemsLocation;

    private String itemsLocationTime;

    private String itemsState;

    public String getItemsInfoId() {
        return itemsInfoId;
    }

    public void setItemsInfoId(String itemsInfoId) {
        this.itemsInfoId = itemsInfoId == null ? null : itemsInfoId.trim();
    }

    public String getItemsInfoName() {
        return itemsInfoName;
    }

    public void setItemsInfoName(String itemsInfoName) {
        this.itemsInfoName = itemsInfoName == null ? null : itemsInfoName.trim();
    }

    public String getStudentExamNum() {
        return studentExamNum;
    }

    public void setStudentExamNum(String studentExamNum) {
        this.studentExamNum = studentExamNum == null ? null : studentExamNum.trim();
    }

    public String getItemsInfoCategory() {
        return itemsInfoCategory;
    }

    public void setItemsInfoCategory(String itemsInfoCategory) {
        this.itemsInfoCategory = itemsInfoCategory == null ? null : itemsInfoCategory.trim();
    }

    public String getComputerMac() {
        return computerMac;
    }

    public void setComputerMac(String computerMac) {
        this.computerMac = computerMac == null ? null : computerMac.trim();
    }

    public String getItemsInfoImage() {
        return itemsInfoImage;
    }

    public void setItemsInfoImage(String itemsInfoImage) {
        this.itemsInfoImage = itemsInfoImage == null ? null : itemsInfoImage.trim();
    }

    public String getItemsInfoDescribe() {
        return itemsInfoDescribe;
    }

    public void setItemsInfoDescribe(String itemsInfoDescribe) {
        this.itemsInfoDescribe = itemsInfoDescribe == null ? null : itemsInfoDescribe.trim();
    }

    public String getItemsReview() {
        return itemsReview;
    }

    public void setItemsReview(String itemsReview) {
        this.itemsReview = itemsReview == null ? null : itemsReview.trim();
    }

    public String getItemsLocation() {
        return itemsLocation;
    }

    public void setItemsLocation(String itemsLocation) {
        this.itemsLocation = itemsLocation == null ? null : itemsLocation.trim();
    }

    public String getItemsLocationTime() {
        return itemsLocationTime;
    }

    public void setItemsLocationTime(String itemsLocationTime) {
        this.itemsLocationTime = itemsLocationTime == null ? null : itemsLocationTime.trim();
    }

    public String getItemsState() {
        return itemsState;
    }

    public void setItemsState(String itemsState) {
        this.itemsState = itemsState == null ? null : itemsState.trim();
    }
}