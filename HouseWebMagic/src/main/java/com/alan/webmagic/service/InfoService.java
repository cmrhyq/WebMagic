package com.alan.webmagic.service;

import com.alan.webmagic.domain.HouseInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService {

    public void save(HouseInfo houseInfo);

    public List<HouseInfo> findHouseInfo(HouseInfo houseInfo);
}
