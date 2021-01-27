package com.worm.webMagic.dao;

import com.worm.webMagic.pojo.HouseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author AlanWalker on 2021/1/26 15:26
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.dao
 * @classname HouseInfoDao
 * @since 0.0.1
 */
public interface HouseInfoDao extends JpaRepository<HouseInfo, Integer> {

}
