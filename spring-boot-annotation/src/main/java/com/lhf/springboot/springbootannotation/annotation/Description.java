package com.lhf.springboot.springbootannotation.annotation;

import java.lang.annotation.*;

/**
 * @ClassName: Description
 * @Author: liuhefei
 * @Description: 自定义注解
 * @Date: 2019/5/14 16:39
 */
@Target({ElementType.METHOD,ElementType.TYPE})  //作用域
@Retention(RetentionPolicy.RUNTIME)  //声明周期
@Documented
@Inherited
public @interface Description {
    //1.类型受限制，包括基本类型及String、Class、Annotation、Enumeration
    //2.若只有一个成员，则名称必须为value(),使用时可以忽略成员名和赋值号(=)
    //3.注解类可以没有成员，称为标识注解
    //4.成员无参且无异常声明
    //5.可以指定默认值

    String desc();  //描述

    String author();  //作者

    int age() default 18;  //年龄
}
