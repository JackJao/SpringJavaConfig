package com.jason.demo.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/23 13:03
 */
@Component
public class MyCDPlayer implements CompactDisc {
    private String title = "JayChou 11";
    private String artist = "东风破";
    @Override
    public void player() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
