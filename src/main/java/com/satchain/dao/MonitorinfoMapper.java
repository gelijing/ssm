package com.satchain.dao;

import com.satchain.bean.model.Monitorinfo;
import org.apache.ibatis.annotations.Param;

public interface MonitorinfoMapper {

    int deleteById(@Param("monitorId") String monitorId);

    int insert(Monitorinfo record);

    int insertSelective(Monitorinfo record);

    Monitorinfo selectById(@Param("monitorId") String monitorId, @Param("monitorStation") String monitorStation);

    int updateByIdSelective(@Param("monitorId") String monitorId, @Param("monitorStation") String monitorStation,
                            @Param("monitorUrl") String monitorUrl);

    int updateByPrimaryKey(Monitorinfo record);
}