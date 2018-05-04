package com.jason.demo.beans.rename;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: Spring的Bean的注入方式
 * 自动装配就是让Spring自动满足bean依赖的一种方法，在满足依赖的过程中，会在Spring应用上下文中寻找匹配某个bean需求的其他bean。
 * 例如：我们在service层中需要依赖dao层的bean，就需要使用自动装配
 * @Author Gao
 * @Date 2018/4/23 14:53
 */
@Component
public class BeanDIMethod {

    private CompactDisc compactDisc;

    /**
     * 方式一构造器注入:CompactDisc compactDisc
     */
    @Autowired
    public BeanDIMethod(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    /**
     * 方式二属性注入:
     */
    @Autowired
    private CompactDisc compactDisc2;

    private CompactDisc compactDisc3;

    /**
     * 方式三方法注入：一般推荐set命名的方法
     */
    @Autowired
    public void setCompactDisc3(CompactDisc compactDisc){
        this.compactDisc3 = compactDisc;
    }

    /**
     * 这种和上面一样，同样是方法注入,不推荐
     * @param compactDisc
     */
    @Autowired
    public void compactDisc3(CompactDisc compactDisc){
        this.compactDisc3 = compactDisc;
    }
}
