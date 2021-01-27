package com.worm.webMagic.service;

import com.worm.webMagic.pojo.HouseInfo;

import java.util.List;

/**
 * @author AlanWalker on 2021/1/26 15:42
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.service
 * @classname HouseInfoService
 * @since 0.0.1
 */

public interface HouseInfoService {

    /**
     * 保存信息
     * @param houseInfo
     */
    public void save(HouseInfo houseInfo);

    /**
     * 查询信息
     * @param houseInfo
     * @return
     */
    public List<HouseInfo> findJobInfo(HouseInfo houseInfo);
}
