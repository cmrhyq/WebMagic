package com.worm.webMagic.service.impl;

import com.worm.webMagic.dao.HouseInfoDao;
import com.worm.webMagic.pojo.HouseInfo;
import com.worm.webMagic.service.HouseInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author AlanWalker on 2021/1/26 15:49
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.service.impl
 * @classname HouseInfoServiceImpl
 * @since 0.0.1
 */

@Service
public class HouseInfoServiceImpl implements HouseInfoService {

    @Autowired
    private HouseInfoDao houseInfoDao;

    @Override
    @Transactional
    public void save(HouseInfo houseInfo) {
        //根据url查询数据，并判断结构是否为空，表信息已存在或已更新
        HouseInfo param = new HouseInfo();
        param.setHouseInfoUrl(houseInfo.getHouseInfoUrl());
        List<HouseInfo> list = this.findJobInfo(param);

        if(list.size() == 0){
            this.houseInfoDao.saveAndFlush(houseInfo);
        }

    }

    @Override
    public List<HouseInfo> findJobInfo(HouseInfo houseInfo) {
        Example example = Example.of(houseInfo);

        List list = this.houseInfoDao.findAll(example);
        return list;
    }
}
