package com.satchain.controller.web;

import com.satchain.bean.model.Monitorinfo;
import com.satchain.commons.result.Result;
import com.satchain.service.MonitorinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 监控信息表
 */
@RestController
@RequestMapping("/")
public class MonitorinfoController {
    @Autowired
    private MonitorinfoService monitorinfoService;
    /**
     * 40 添加监控器
     */
    @RequestMapping(value = "/addMonitor", method = RequestMethod.POST)
    public void addMonitor(Monitorinfo bo){
        monitorinfoService.addMonitorInfo(bo);
    }
    /**
     * 41 查询监视器
     */
    @RequestMapping(value = "/queryMonitor", method = RequestMethod.POST)
    public Monitorinfo queryMonitor(@RequestParam("monitorId") String monitorId, @RequestParam("monitorStation") String monitorStation){
        return monitorinfoService.queryMonitorInfo(monitorId,monitorStation);
    }
    /**
     * 42 删除监控器
     */
    @RequestMapping(value = "/deleteMonitor", method = RequestMethod.DELETE)
    public void deleteMonitor(@RequestParam("monitorId") String monitorId){
        monitorinfoService.deleteMonitorInfo(monitorId);
    }
    /**
     * 43 编辑监控器
     */
    @RequestMapping(value = "/editMonitor", method = RequestMethod.POST)
    public Result editMonitor(@RequestParam("monitorId") String monitorId, @RequestParam("monitorStation") String monitorStation,
                              @RequestParam("monitorUrl") String monitorUrl){
        monitorinfoService.updateMonitorInfo(monitorId,monitorStation,monitorUrl);
        return null;
    }
}
