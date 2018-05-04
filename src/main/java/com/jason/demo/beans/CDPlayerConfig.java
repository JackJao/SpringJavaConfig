package com.jason.demo.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description: <context:component-scan base-package="com.jason.demo.beans"/>
 * @Configuration和@ComponentScan等价上面xml配置，默扫描当前类所在包(包括所在的子包)的所有带有@Component注解的类，并自动创建bean
 * @Author Gao
 * @Date 2018/4/23 13:15
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
