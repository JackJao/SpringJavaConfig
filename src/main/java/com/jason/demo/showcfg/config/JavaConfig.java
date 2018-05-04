package com.jason.demo.showcfg.config;

import com.jason.demo.showcfg.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 显式装配的方式用javaConfig配置
 * 关键注解：@Configuration
 * @Configuration注解表明这个类是一个配置类，该类应该包含在Spring应用上下文中如何创建bean的细节。
 * @Author Gao
 * @Date 2018/4/23 15:26
 */
@Configuration
//@ComponentScans({@ComponentScan(basePackages = {"com"}),@ComponentScan})
public class JavaConfig {

    /**
     * 显示的注入bean就可以不使用@ComponentScan扫描bean
     * 默认beanName=方法名，例如：getMp3PlayerBean
     * @return
     */
    @Bean(name = "Mp3PlayerBeanName")
    public MediaPlayer getMp3PlayerBean(){
        return new Mp3Player();
    }

    /*@Bean
    public CompactDisc myCDBeanName(){
        //mediaPlayer.player();
        return new MyCD();
    }*/
    @Bean(name = "myCDBeanName2")
    public CompactDisc myCDBeanName2(){
        return new MyCD(getMp3PlayerBean());
    }

    /**
     *我们前面所声明的CompactDisc bean是非常简单的，它自身没有其他的依赖。但现在，我
     们需要声明CDPlayerbean，它依赖于CompactDisc。在JavaConfig中，要如何将它们装配
     在一起呢？
     在JavaConfig中装配bean的最简单方式就是引用创建bean的方法。例如，下面就是一种声
     明CDPlayer的可行方案：
     * @return
     */
    @Bean
    public MediaPlayer mediaPlayer(){
        return new Mp4Player(myCDBeanName2());
    }
}
