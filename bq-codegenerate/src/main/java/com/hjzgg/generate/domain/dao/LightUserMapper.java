package com.hjzgg.generate.domain.dao;

import com.hjzgg.generate.domain.entity.LightUser;

public interface LightUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(LightUser record);

    int insertSelective(LightUser record);

    LightUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(LightUser record);

    int updateByPrimaryKey(LightUser record);
}