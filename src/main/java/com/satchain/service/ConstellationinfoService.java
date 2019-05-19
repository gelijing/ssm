package com.satchain.service;

import com.satchain.bean.model.Constellationinfo;
import com.satchain.dao.ConstellationinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 星座信息表
 */
@Service
public class ConstellationinfoService {

    @Autowired
    private ConstellationinfoMapper constellationinfoMapper;

    public List<Constellationinfo> queryConstellationInfoList() {
        return constellationinfoMapper.selectAll();
    }

    public Constellationinfo queryConstellationInfo(String constellationId) {
        return constellationinfoMapper.selectById(constellationId);
    }

    public void addConstellationInfo(Constellationinfo bo) {
        constellationinfoMapper.insert(bo);
    }

    public void deleteConstellationInfo(String constellationId) {
        int deleteResult = constellationinfoMapper.deleteById(constellationId);
        Assert.isTrue(deleteResult==1,"删除失败！");
    }

    public void updateConstellationInfo(Constellationinfo bo) {
        constellationinfoMapper.updateByIdSelective(bo);
    }

}
