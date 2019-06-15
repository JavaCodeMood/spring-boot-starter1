package com.lhf.springboot.springbootannotation.test;

import com.lhf.springboot.springbootannotation.annotation.Description;
import com.lhf.springboot.springbootannotation.model.User;

/**
 * @ClassName: UserTest1
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 18:12
 */
public class UserTest1 {

    public static void main(String[] args) {
        //通过反射获得User类的class对象
        Class<User> userClass = User.class;
        if(userClass.isAnnotationPresent(Description.class)){
            //通过class对象获取Description注解对象
            Description description = userClass.getAnnotation(Description.class);
            //获取注解中的属性值
            String desc = description.desc();
            String author = description.author();
            Integer age = description.age();
            System.out.println("desc= " + desc + ", author= " + author + ", age = " + age);
        }else {
            System.out.println("该类上没有注解");
        }
    }
}
