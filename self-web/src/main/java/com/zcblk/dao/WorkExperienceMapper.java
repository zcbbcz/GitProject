package com.zcblk.dao;

import com.zcblk.model.WorkExperience;

public interface WorkExperienceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    WorkExperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkExperience record);

    int updateByPrimaryKey(WorkExperience record);
}