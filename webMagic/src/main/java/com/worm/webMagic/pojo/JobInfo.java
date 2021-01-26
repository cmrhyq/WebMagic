package com.worm.webMagic.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int houseInfoId;
    private String houseInfoCommunityName;
    private String houseInfoArea;
    private String houseInfoLookTime;
    private int houseInfoNumber;
    private String houseInfoPlaceProvinceCity;
    private String houseInfoUrl;
    private String createTime;
    private String modifiedTime;

    public int getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(int houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getHouseInfoCommunityName() {
        return houseInfoCommunityName;
    }

    public void setHouseInfoCommunityName(String houseInfoCommunityName) {
        this.houseInfoCommunityName = houseInfoCommunityName;
    }

    public String getHouseInfoArea() {
        return houseInfoArea;
    }

    public void setHouseInfoArea(String houseInfoArea) {
        this.houseInfoArea = houseInfoArea;
    }

    public String getHouseInfoLookTime() {
        return houseInfoLookTime;
    }

    public void setHouseInfoLookTime(String houseInfoLookTime) {
        this.houseInfoLookTime = houseInfoLookTime;
    }

    public int getHouseInfoNumber() {
        return houseInfoNumber;
    }

    public void setHouseInfoNumber(int houseInfoNumber) {
        this.houseInfoNumber = houseInfoNumber;
    }

    public String getHouseInfoPlaceProvinceCity() {
        return houseInfoPlaceProvinceCity;
    }

    public void setHouseInfoPlaceProvinceCity(String houseInfoPlaceProvinceCity) {
        this.houseInfoPlaceProvinceCity = houseInfoPlaceProvinceCity;
    }

    public String getHouseInfoUrl() {
        return houseInfoUrl;
    }

    public void setHouseInfoUrl(String houseInfoUrl) {
        this.houseInfoUrl = houseInfoUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "houseInfoId=" + houseInfoId +
                ", houseInfoCommunityName='" + houseInfoCommunityName + '\'' +
                ", houseInfoArea='" + houseInfoArea + '\'' +
                ", houseInfoLookTime='" + houseInfoLookTime + '\'' +
                ", houseInfoNumber=" + houseInfoNumber +
                ", houseInfoPlaceProvinceCity='" + houseInfoPlaceProvinceCity + '\'' +
                ", houseInfoUrl='" + houseInfoUrl + '\'' +
                ", createTime='" + createTime + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                '}';
    }
}
