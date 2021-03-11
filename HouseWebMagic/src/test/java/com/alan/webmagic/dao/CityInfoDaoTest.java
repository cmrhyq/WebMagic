package com.alan.webmagic.dao;

import com.alan.webmagic.WebmagicApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author Kevin KDA on 2021/2/6 23:16
 * @version 0.0.1
 * @project webmagic
 * @package com.alan.webmagic.dao
 * @classname com.alan.webmagic.dao.CityInfoDao
 * @apiNote
 * @implSpec
 * @implNote
 * @since 0.0.1
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebmagicApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CityInfoDaoTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findCityUrlTwo() {
    }
}