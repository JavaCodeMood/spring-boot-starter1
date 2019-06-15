package com.lhf.springboot.springbootannotation.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: Table
 * @Author: liuhefei
 * @Description: 自定义注解
 * @Date: 2019/5/14 18:22
 */
@Target({ElementType.TYPE})  //作用域
@Retention(RetentionPolicy.RUNTIME)  //生命周期
@Documented
@Inherited
public @interface Table {

    String value();
}
