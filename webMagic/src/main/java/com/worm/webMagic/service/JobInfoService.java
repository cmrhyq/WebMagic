package com.worm.webMagic.service;

import com.worm.webMagic.pojo.JobInfo;

import java.util.List;

/**
 * @author AlanWalker on 2021/1/26 15:42
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.pojo
 * @classname JobInfo
 * @since 0.0.1
 */

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
