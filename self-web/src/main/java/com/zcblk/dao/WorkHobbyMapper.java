package com.zcblk.dao;

import com.zcblk.model.WorkHobby;

public interface WorkHobbyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkHobby record);

    int insertSelective(WorkHobby record);

    WorkHobby selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkHobby record);

    int updateByPrimaryKeyWithBLOBs(WorkHobby record);

    int updateByPrimaryKey(WorkHobby record);
}