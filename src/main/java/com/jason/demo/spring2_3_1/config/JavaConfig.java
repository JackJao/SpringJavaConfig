package com.jason.demo.spring2_3_1.config;

import com.jason.demo.spring2_3_1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 显示的注入bean
 * 显示的注入bean就可以不使用@ComponentScan扫描bean
 * 默认beanNae=方法名，例如：getMp3PlayerBean
 */
@Configuration
public class JavaConfig {
    @Bean
    public IMediaPlayer mp4Player() {
        return new Mp4Player();
    }

    @Bean
    public IMediaPlayer mp3Player() {
        return new Mp3Player();
    }

    @Bean
    public ICompactDisc jayChouCD() {
        return new JayChouCD();
    }

    /**
     * 1.像java一样调用
     * 输出:
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * @return
     */
    @Bean
    public IMediaPlayer mp3PlayerPlaying(){
        return new Mp3Player(jayChouCD());
    }

    /**
     * 2.这两种(1,2)一样,这个更直观
     * 输出:
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * @return
     */
    @Bean
    public IMediaPlayer mp3PlayerPlaying2(ICompactDisc jayChouCD){
        return new Mp3Player(jayChouCD);
    }

}
