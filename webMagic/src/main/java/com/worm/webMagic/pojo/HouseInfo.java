package com.worm.webMagic.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author AlanWalker on 2021/1/26 15:30
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.pojo
 * @classname HouseInfo
 * @since 0.0.1
 */

@Entity
public class HouseInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 房源id
     */
    private int houseInfoId;
    /**
     * 房源小区名称
     */
    private String houseInfoCommunityName;
    /**
     * 房源所在区域
     */
    private String houseInfoArea;
    /**
     * 看房信息
     */
    private String houseInfoLookTime;
    /**
     * 房屋编号
     */
    private int houseInfoNumber;
    /**
     * 房源所在省市
     */
    private String houseInfoPlaceProvinceCity;
    /**
     * 房源页面地址
     */
    private String houseInfoUrl;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
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
