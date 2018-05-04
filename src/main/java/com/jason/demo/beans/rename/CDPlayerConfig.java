package com.jason.demo.beans.rename;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: <context:component-scan base-package="com.jason.demo.beans"/>
 * @Configuration和@ComponentScan等价上面xml配置，默扫描当前类所在包(包括所在的子包)的所有带有@Component注解的类，并自动创建bean
 * 以下3个组件扫描配置等价,都是扫描制定的包/类所在的包,第二种直观
 * @Author Gao
 * @Date 2018/4/23 13:15
 */
@Configuration("CDPlayerConfigID")
//@ComponentScan({"com.jason.demo.beans.rename","com.jason.demo.beans"})
@ComponentScan(basePackages = {"com.jason.demo.beans.rename","com.jason.demo.beans"})
//@ComponentScan(basePackageClasses = {CDPlayer.class, com.jason.demo.beans.CDPlayer.class})
public class CDPlayerConfig {
}
