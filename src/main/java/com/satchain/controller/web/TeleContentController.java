package com.satchain.controller.web;

import com.satchain.bean.bo.TeleControlContentBO;
import com.satchain.bean.vo.ContentInfoVO;
import com.satchain.commons.result.Result;
import com.satchain.service.TeleContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 遥控内容表：增查
 */
@RestController
@RequestMapping("/")
public class TeleContentController {

    @Autowired
    private TeleContentService teleContentService;

    /**
     * 遥控内容增加
     * @return
     */
    @RequestMapping(value = "/addTelecontrolContent", method = RequestMethod.POST)
    public Result addTeleContent(TeleControlContentBO bo) {
        Assert.notNull(bo,"参数错误！");

        teleContentService.insertTeleContent(bo);
        return Result.success();
    }

    /**
     * 遥控内容查询
     * @return
     */
    @RequestMapping(value = "/queryTelecontrolContent", method = RequestMethod.POST)
    public Result queryTeleContent(@RequestParam("constellationid") String constellationid,
                                   @RequestParam("satelliteid") String satelliteid,
                                   @RequestParam("beginTime") String beginTime,
                                   @RequestParam("endTime") String endTime) {
        List<ContentInfoVO> contentinfos = teleContentService.queryContentInfo(constellationid,satelliteid,beginTime,endTime);
        return Result.success(contentinfos);
    }
}
