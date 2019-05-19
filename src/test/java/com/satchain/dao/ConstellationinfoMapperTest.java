package com.satchain.dao;

import com.satchain.bean.model.Constellationinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 董少飞
 * @date 2019/5/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ConstellationinfoMapperTest {

    @Autowired
    private ConstellationinfoMapper constellationinfoMapper;

    @Test
    public void deleteById() {
//        constellationinfoMapper.deleteById()
    }

    @Test
    public void insert() {
        Constellationinfo constellationinfo = new Constellationinfo();
        constellationinfo.setConstellationName("董少飞的星座");
        constellationinfo.setConstellationType((byte) 1);
        constellationinfo.setConstellationUuid("1");
        constellationinfoMapper.insert(constellationinfo);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectById() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByIdSelective() {
    }
}