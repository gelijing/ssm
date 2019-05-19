package com.satchain.service;

import com.satchain.bean.model.Satelliteinfo;
import com.satchain.dao.SatelliteinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SatelliteinfoService {
    @Autowired
    private SatelliteinfoMapper satelliteinfoMapper;

    public Satelliteinfo querySatelliteInfo(String satelliteId, String satelliteName) {
        return satelliteinfoMapper.selectBySatelliteId(satelliteId,satelliteName);
    }

    public Integer insertSatellite(Satelliteinfo bo) {
        return satelliteinfoMapper.insert(bo);
    }

    public Integer deleteSatelliteInfo(String satelliteId, String satelliteName) {
        return satelliteinfoMapper.deleteByIdName(satelliteId,satelliteName);
    }

    public Integer updateSatelliteInfo(Satelliteinfo bo) {
        return satelliteinfoMapper.updateByIdSelective(bo);
    }

}
