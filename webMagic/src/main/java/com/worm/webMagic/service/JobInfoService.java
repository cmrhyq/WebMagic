package com.worm.webMagic.service;

import com.worm.webMagic.pojo.JobInfo;

import java.util.List;

public interface JobInfoService {

    /**
     * 保存信息
     * @param jobInfo
     */
    public void save(JobInfo jobInfo);

    /**
     * 查询信息
     * @param jobInfo
     * @return
     */
    public List<JobInfo> findJobInfo(JobInfo jobInfo);
}
