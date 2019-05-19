package com.satchain.service;

import com.satchain.bean.model.Earthinfo;
import com.satchain.dao.EarthinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 地面站信息表：增删改查
 */
@Service
public class EarthinfoService {
    @Autowired
    private EarthinfoMapper earthinfoMapper;

    /**
     * 查询地面站信息
     * @param groundId
     * @param groundName
     * @return
     */
    public Earthinfo queryEarthInfo(String groundId, String groundName) {
        return earthinfoMapper.queryEarthInfoByGroundId(groundId,groundName);
    }

    /**
     * 新增地面站
     * @param bo
     * @return
     */
    public Integer insertEarthInfo(Earthinfo bo) {
        return earthinfoMapper.insert(bo);
    }

    /**
     * 删除地面站信息
     * @param groundId
     */
    public Integer deleteEarthInfo(String groundId) {
        return earthinfoMapper.deleteByGroundId(groundId);
    }

    /**
     * 修改地面站信息
     * @param bo
     */
    public Integer updateEarthInfo(Earthinfo bo) {
        return earthinfoMapper.updateByGroundId(bo);
    }

}
