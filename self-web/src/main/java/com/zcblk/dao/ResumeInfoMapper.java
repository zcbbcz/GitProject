package com.zcblk.dao;

import com.zcblk.model.ResumeInfo;

public interface ResumeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeInfo record);

    int insertSelective(ResumeInfo record);

    ResumeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeInfo record);

    int updateByPrimaryKey(ResumeInfo record);
}