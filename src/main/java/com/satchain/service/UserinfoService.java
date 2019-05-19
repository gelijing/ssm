package com.satchain.service;

import com.satchain.bean.model.Userinfo;
import com.satchain.dao.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户信息：增删改查
 */
@Service
public class UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    public Integer insertUser(String username, String password, Integer permission) {
        return userinfoMapper.insert(username,password,permission,new Date());
    }

    /**
     * 查询用户信息
     * @param username
     * @return
     */
    public Userinfo queryUserInfo(String username) {
        Userinfo userinfo = userinfoMapper.queryUserInfoByName(username);
        return userinfo;
    }

    /**
     * 编辑用户信息
     * @param username
     * @param password
     * @param permission
     */
    public Integer updateUserInfo(String username, String password, Integer permission) {
        return userinfoMapper.updateByUserName(username,password,permission);
    }

    /**
     * 删除用户信息
     * @param username
     */
    public Integer deleteUserInfo(String username) {
        return userinfoMapper.deleteByUserName(username);
    }

}
