package com.worm.webMagic.service.impl;

import com.worm.webMagic.dao.JobInfoDao;
import com.worm.webMagic.pojo.JobInfo;
import com.worm.webMagic.service.JobInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author AlanWalker on 2021/1/26 15:49
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.pojo
 * @classname JobInfo
 * @since 0.0.1
 */

@Service
public class JobInfoServiceImpl implements JobInfoService {

    @Autowired
    private JobInfoDao jobInfoDao;

    @Override
    @Transactional
    public void save(JobInfo jobInfo) {
        //根据url查询数据，并判断结构是否为空，表信息已存在或已更新
        JobInfo param = new JobInfo();
        param.setHouseInfoUrl(jobInfo.getHouseInfoUrl());
        List<JobInfo> list = this.findJobInfo(param);

        if(list.size() == 0){
            this.jobInfoDao.saveAndFlush(jobInfo);
        }

    }

    @Override
    public List<JobInfo> findJobInfo(JobInfo jobInfo) {
        Example example = Example.of(jobInfo);

        List list = this.jobInfoDao.findAll(example);
        return list;
    }
}
