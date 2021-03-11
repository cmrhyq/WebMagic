package com.alan.webmagic.service.Impl;

import com.alan.webmagic.dao.HouseInfoDao;
import com.alan.webmagic.domain.HouseInfo;
import com.alan.webmagic.service.InfoService;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {

    //    @Autowired
    @Resource
    private HouseInfoDao houseInfoDao;

    @Override
    @Transactional
    public void save(HouseInfo houseInfo) {
        HouseInfo param = new HouseInfo();
        param.setHouseInfoName(houseInfo.getHouseInfoName());
        param.setHouseInfoNumber(houseInfo.getHouseInfoNumber());

        List<HouseInfo> list = this.findHouseInfo(param);

        if (list.size() == 0) {
            this.houseInfoDao.saveAndFlush(houseInfo);
        }
    }

    @Override
    public List<HouseInfo> findHouseInfo(HouseInfo houseInfo) {
        Example example = Example.of(houseInfo);

        List list = this.houseInfoDao.findAll(example);

        return list;
    }

}
