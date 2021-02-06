package com.alan.webmagic.service;

import com.alan.webmagic.domain.CityInfo;
import com.alan.webmagic.domain.HouseInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService {

    public void save(HouseInfo houseInfo);

    public List<HouseInfo> findHouseInfo(HouseInfo houseInfo);

    public List<CityInfo> findCityInfoOne();

    public List<CityInfo> findCityInfoTwo();
}
