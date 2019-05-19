package com.satchain.service;

import com.satchain.bean.bo.AddTaskBO;
import com.satchain.bean.bo.QueryTaskBO;
import com.satchain.bean.model.Taskinfo;
import com.satchain.commons.myEnum.TaskinfoDatadistrisignEnum;
import com.satchain.commons.utils.TimeConvertUtil;
import com.satchain.dao.TaskinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TaskAssignmentService {

    @Autowired
    private TaskinfoMapper taskinfoMapper;

    /**
     * 3 查询任务
     * @param bo
     * @return
     */
    public List<Taskinfo> queryTask(QueryTaskBO bo){
        Timestamp startTime = TimeConvertUtil.str2dateTime(bo.getPlanstarttime());
        Timestamp endTime = TimeConvertUtil.str2dateTime(bo.getPlanstoptime());
        List<Taskinfo> taskinfoList = taskinfoMapper.
                queryTaskInfoByTaskBO(bo.getConstellationid(),bo.getSatelliteid(),bo.getTasktype(),bo.getDistrisign(),startTime,endTime);
        return taskinfoList;
    }

    /**
     * 4 新增任务
     * @param bo
     * @return
     */
    public Integer addTask(AddTaskBO bo){
        Timestamp startTime = TimeConvertUtil.str2dateTime(bo.getPlanstarttime());
        Timestamp endTime = TimeConvertUtil.str2dateTime(bo.getPlanendtime());

        Taskinfo taskinfo = new Taskinfo();
        taskinfo.setEarthUuid(bo.getGroundid());
        taskinfo.setSatelliteUuid(bo.getSatelliteid());
        taskinfo.setTaskType(bo.getTasktype());
        taskinfo.setPlanStartTime(startTime);
        taskinfo.setPlanEndTime(endTime);
        return taskinfoMapper.insert(taskinfo);

    }

    /**
     * 更新任务
     * @param bo
     */
    public Integer updateTask(QueryTaskBO bo){

        Assert.notNull(taskinfoMapper.selectByTaskId(bo.getTaskid()),"数据不存在！");
        Taskinfo taskinfo = new Taskinfo();
        taskinfo.setTaskUuid(bo.getTaskid());
        taskinfo.setSatelliteUuid(bo.getSatelliteid());
        taskinfo.setTaskType(bo.getTasktype());
        Timestamp startTime = TimeConvertUtil.str2dateTime(bo.getPlanstarttime());
        Timestamp endTime = TimeConvertUtil.str2dateTime(bo.getPlanstoptime());
        taskinfo.setPlanStartTime(startTime);
        taskinfo.setPlanEndTime(endTime);
        return taskinfoMapper.updateByTaskId(taskinfo);
    }

    /**
     * 删除任务
     * @param taskid
     * @param distrisign
     * @return
     */
    public Integer deleteTask(Integer taskid,Integer distrisign){
        return taskinfoMapper.deleteByTaskid(taskid,distrisign);
    }

    /**
     * 发布任务 + 撤回任务
     * @param taskid
     * @param distrisign
     * @return
     */
    public Integer updateDistrisign(Integer taskid,Integer distrisign){
        if (distrisign == null){
            distrisign = TaskinfoDatadistrisignEnum.PUBLISHED.getCode();
        }
        taskinfoMapper.updateFlagByTaskId(taskid,distrisign);
        return distrisign;
    }








}