package com.jason.demo.showcfg;

import org.springframework.stereotype.Component;

import javax.print.attribute.standard.Media;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/23 13:03
 */
@Component
public class Mp3Player implements MediaPlayer {
    @Override
    public void player() {
        System.out.println("Mp3 playing...");
    }
}
