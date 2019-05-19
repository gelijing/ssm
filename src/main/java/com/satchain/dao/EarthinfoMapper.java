package com.satchain.dao;

import com.satchain.bean.model.Earthinfo;
import org.apache.ibatis.annotations.Param;

public interface EarthinfoMapper {
    int deleteByGroundId(@Param("groundId") String groundId);

    int insert(Earthinfo record);

    int insertSelective(Earthinfo record);

    int updateByPrimaryKeySelective(Earthinfo record);

    int updateByGroundId(Earthinfo record);

    Earthinfo queryEarthInfoByGroundId(@Param("groundId") String groundId, @Param("groundName") String groundName);

}