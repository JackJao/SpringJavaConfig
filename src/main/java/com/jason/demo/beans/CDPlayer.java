package com.jason.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: CD播放器
 * @Author Gao
 * @Date 2018/4/23 11:59
 */
public class CDPlayer {
    static {
        compactDisc = new MyCDPlayer();
    }
    private static CompactDisc compactDisc;

    public static void main(String[] args) {
        compactDisc.player();
    }
}
