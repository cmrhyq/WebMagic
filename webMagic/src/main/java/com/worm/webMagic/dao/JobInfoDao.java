package com.worm.webMagic.dao;

import com.worm.webMagic.pojo.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author AlanWalker on 2021/1/26 15:26
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.dao
 * @classname JobInfoDao
 * @since 0.0.1
 */
public interface JobInfoDao extends JpaRepository<JobInfo, Integer> {

}
