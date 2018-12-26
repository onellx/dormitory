package com.jjvu.dormitory.po;

public class ItemsOutRecords {
    private String itemsRecordsId;

    private String itemsInfoId;

    private String itemsRecordsTime;

    private String itemsRecordsState;

    public String getItemsRecordsId() {
        return itemsRecordsId;
    }

    public void setItemsRecordsId(String itemsRecordsId) {
        this.itemsRecordsId = itemsRecordsId == null ? null : itemsRecordsId.trim();
    }

    public String getItemsInfoId() {
        return itemsInfoId;
    }

    public void setItemsInfoId(String itemsInfoId) {
        this.itemsInfoId = itemsInfoId == null ? null : itemsInfoId.trim();
    }

    public String getItemsRecordsTime() {
        return itemsRecordsTime;
    }

    public void setItemsRecordsTime(String itemsRecordsTime) {
        this.itemsRecordsTime = itemsRecordsTime == null ? null : itemsRecordsTime.trim();
    }

    public String getItemsRecordsState() {
        return itemsRecordsState;
    }

    public void setItemsRecordsState(String itemsRecordsState) {
        this.itemsRecordsState = itemsRecordsState == null ? null : itemsRecordsState.trim();
    }
}