package com.worm.webMagic.dao;

import com.worm.webMagic.pojo.JobInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoDao extends JpaRepository<JobInfo, Integer> {
}
