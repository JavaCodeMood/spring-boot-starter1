package com.lhf.springboot.springbootannotation.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: Column
 * @Author: liuhefei
 * @Description: 自定义注解
 * @Date: 2019/5/14 18:24
 */
@Target({ElementType.FIELD})  //作用域
@Retention(RetentionPolicy.RUNTIME)  //生命周期
@Documented
@Inherited
public @interface Column {

    String value();
}
