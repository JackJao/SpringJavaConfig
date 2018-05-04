package com.jason.demo.spring2_3_1;

import org.springframework.stereotype.Component;

/**
 * 周杰伦的CD
 */
@Component
public class JayChouCD implements ICompactDisc {

    public JayChouCD() {
        System.out.println("周杰伦的CD（无参数构造Bean） init ...");
    }

    @Override
    public void played() {
        System.out.println("正在播放双截棍 ...");
    }
}
