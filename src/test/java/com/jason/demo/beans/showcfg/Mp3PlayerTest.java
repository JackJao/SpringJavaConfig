package com.jason.demo.beans.showcfg;

import com.jason.demo.showcfg.CompactDisc;
import com.jason.demo.showcfg.MediaPlayer;
import com.jason.demo.showcfg.config.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

/**
 * @Description: 测试创建bean
 * @Author Gao
 * @Date 2018/4/23 13:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class Mp3PlayerTest {
    @Autowired
    private MediaPlayer mediaPlayer;
    /*@Resource(name = "myCDBeanName2")*/
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(mediaPlayer);
    }

    /**
     * 测试myCDBeanName2shifou 被创建
     * 测试mediaPlayer是否被创建
     */
    @Test
    public void show(){
        //assertNotNull(mediaPlayer);
        assertNotNull(compactDisc);
    }


}
