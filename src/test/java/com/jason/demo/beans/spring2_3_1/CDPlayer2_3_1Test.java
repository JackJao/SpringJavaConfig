package com.jason.demo.beans.spring2_3_1;

import com.jason.demo.spring2_3_1.ICompactDisc;
import com.jason.demo.spring2_3_1.IMediaPlayer;
import com.jason.demo.spring2_3_1.Mp3Player;
import com.jason.demo.spring2_3_1.Mp4Player;
import com.jason.demo.spring2_3_1.config.JavaConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * JavaConfig中有多少个bean就会初始化多少个
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class CDPlayer2_3_1Test {

    /*@Resource
    private ICompactDisc iCompactDisc;*/
    /**
     * @Resource默认按照beanName匹配bean，mingzi
     */
    @Resource(name = "mp3Player")
    private IMediaPlayer iMediaPlayer;

    @Resource(name = "mp4Player")
    private IMediaPlayer iMediaPlayer2;

    @Resource
    private ICompactDisc iCompactDisc;

    @Resource(name = "mp3PlayerPlaying")
    private IMediaPlayer iMediaPlayer3;

    @Test
    public void isNotNull(){
        Assert.assertNotNull(iMediaPlayer);
    }

    @Test
    public void invokMethod(){
        iMediaPlayer.player();
    }

    @Test
    public void invokMethod2(){
        iMediaPlayer2.playJayChou(iCompactDisc);
    }

    @Test
    public void invokMethod3(){
        iMediaPlayer.playJayChou(iCompactDisc);
    }

    @Test
    public void invokMethod4(){

    }

    @Resource(name = "mp3PlayerPlaying2")
    private IMediaPlayer iMediaPlayer4;
}
