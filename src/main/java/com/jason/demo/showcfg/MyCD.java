package com.jason.demo.showcfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/23 15:54
 */
@Component
public class MyCD implements CompactDisc{

    public MyCD(MediaPlayer mediaPlayer) {
        mediaPlayer.player();
    }

    public MyCD() {
    }

    @Override
    public void played() {
        System.out.println("MyCD被播放了...");
    }
}
