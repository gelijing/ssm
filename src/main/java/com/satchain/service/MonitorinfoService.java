package com.satchain.service;

import com.satchain.bean.model.Monitorinfo;
import com.satchain.dao.MonitorinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitorinfoService {
    @Autowired
    private MonitorinfoMapper monitorinfoMapper;

    public void addMonitorInfo(Monitorinfo bo) {
        monitorinfoMapper.insert(bo);
    }

    public Monitorinfo queryMonitorInfo(String monitorId, String monitorStation) {
        return monitorinfoMapper.selectById(monitorId,monitorStation);
    }

    public void deleteMonitorInfo(String monitorId) {
        monitorinfoMapper.deleteById(monitorId);
    }

    public void updateMonitorInfo(String monitorId, String monitorStation, String monitorUrl) {
        monitorinfoMapper.updateByIdSelective(monitorId,monitorStation,monitorUrl);
    }
}
