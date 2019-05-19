package com.satchain.controller.web;

import com.satchain.bean.model.Constellationinfo;
import com.satchain.service.ConstellationinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 星座信息表
 */
@RestController
@RequestMapping("/")
public class ConstellationinfoController {
    @Autowired
    private ConstellationinfoService constellationinfoService;
    /**
     * 31 查詢星座下的所有卫星
     */
    //TODO 表有问题

    /**
     * 32 查询全部星座
     */
    //todo 传参数？orNOt
    @RequestMapping(value = "/queryConstellationList", method = RequestMethod.POST)
    public List<Constellationinfo> queryConstellationList(){
        return constellationinfoService.queryConstellationInfoList();
    }
    /**
     * 33 查询星座信息
     */
    @RequestMapping(value = "/queryConstellation", method = RequestMethod.POST)
    public Constellationinfo queryConstellation(@RequestParam("constellationId") String constellationId){
        return constellationinfoService.queryConstellationInfo(constellationId);
    }
    /**
     * 34 新增星座
     */
    @RequestMapping(value = "/addConstellation", method = RequestMethod.POST)
    public void addConstellation(Constellationinfo bo){
        constellationinfoService.addConstellationInfo(bo);
    }
    /**
     * 35 删除星座
     */
    @RequestMapping(value = "/deleteConstellation", method = RequestMethod.DELETE)
    public void deleteConstellation(@RequestParam("constellationId") String constellationId){
        constellationinfoService.deleteConstellationInfo(constellationId);
    }
    /**
     * 36 更改星座
     */
    @RequestMapping(value = "/updateConstellation", method = RequestMethod.POST)
    public void updateConstellation(Constellationinfo bo){
        Assert.notNull(bo,"参数错误！");
        Assert.notNull(bo.getConstellationUuid(),"id不能为空！");
        constellationinfoService.updateConstellationInfo(bo);
    }
}
