package com.lhf.springboot.springbootannotation.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: Init
 * @Author: liuhefei
 * @Description: 自定义注解
 * @Date: 2019/5/14 16:53
 */
@Target({ElementType.FIELD, ElementType.METHOD})  //作用域
@Retention(RetentionPolicy.RUNTIME)  //生命周期
@Documented
@Inherited
public @interface Init {

    public String value() default "";
}
