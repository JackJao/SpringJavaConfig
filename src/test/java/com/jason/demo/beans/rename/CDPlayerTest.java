package com.jason.demo.beans.rename;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @Description: 测试创建bean
 * @Author Gao
 * @Date 2018/4/23 13:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
   private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(mediaPlayer);
    }
}
