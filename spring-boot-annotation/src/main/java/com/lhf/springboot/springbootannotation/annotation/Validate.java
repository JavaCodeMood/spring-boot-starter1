package com.lhf.springboot.springbootannotation.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: Validate
 * @Author: liuhefei
 * @Description: 自定义注解
 * @Date: 2019/5/14 17:35
 */
@Target({ElementType.FIELD, ElementType.METHOD})  //作用域
@Retention(RetentionPolicy.RUNTIME)  //声明周期
@Documented
@Inherited
public @interface Validate {

    public int min() default 3;

    public int max() default 20;

    public boolean isNotNull() default true;
}
