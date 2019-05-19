package com.satchain.controller.web;

import com.satchain.bean.vo.FieldVO;
import com.satchain.commons.result.Result;
import com.satchain.service.FieldDefineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class FieldDefineController {
    @Autowired
    private FieldDefineService fieldDefineService;

    /**
     * 字段定义表读取
     * @param satelliteId
     * @param deviceName
     * @return
     */
    @RequestMapping(value = "/queryField",method = RequestMethod.POST)
    public Result queryField(@RequestParam("satelliteId") String satelliteId,
                             @RequestParam("deviceName") String deviceName){
        List<FieldVO> fieldVOS = fieldDefineService.queryFieldByIdAndName(satelliteId,deviceName);
        return Result.success(fieldVOS);
    }
}
