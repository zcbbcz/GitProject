package com.zcblk.dao;

import com.zcblk.model.CertificateInfo;

public interface CertificateInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CertificateInfo record);

    int insertSelective(CertificateInfo record);

    CertificateInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CertificateInfo record);

    int updateByPrimaryKey(CertificateInfo record);
}