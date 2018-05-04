package com.jason.demo.showcfg;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/23 15:51
 */
public class Mp4Player implements MediaPlayer {
    @Override
    public void player() {
        System.out.println("Mp4 playing...");
    }

    public Mp4Player(){

    }

    public Mp4Player(CompactDisc compactDisc){
        compactDisc.played();
    }
}
