package com.satchain.service;

import com.satchain.bean.model.Loginfo;
import com.satchain.commons.utils.TimeConvertUtil;
import com.satchain.dao.LoginfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class LoginfoService {
    @Autowired
    private LoginfoMapper loginfoMapper;
    /**
     * 日志查询
     */
    public List<Loginfo> queryLogInfo(String starttime, String stoptime){
        Timestamp startTime = TimeConvertUtil.str2dateTime(starttime);
        Timestamp stopTime = TimeConvertUtil.str2dateTime(stoptime);
        return loginfoMapper.queryLogByTime(startTime,stopTime);
    }

    public int deleteLogInfo(String starttime,String stoptime){
        Timestamp startTime = TimeConvertUtil.str2dateTime(starttime);
        Timestamp stopTime = TimeConvertUtil.str2dateTime(stoptime);
        return loginfoMapper.deleteByTime(startTime,stopTime);
    }
}
