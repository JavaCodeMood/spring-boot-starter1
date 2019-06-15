package com.lhf.springboot.springbootannotation.check;

import com.lhf.springboot.springbootannotation.annotation.Description;
import com.lhf.springboot.springbootannotation.annotation.Init;
import com.lhf.springboot.springbootannotation.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @ClassName: UserCheck
 * @Author: liuhefei
 * @Description: 注解解析器
 * @Date: 2019/5/14 17:03
 */
public class UserCheck {

    private static final Logger logger = LoggerFactory.getLogger(UserCheck.class);

    public static User create(){
        User user = new User();
        //获取User类中所有的方法
        Method[] methods = User.class.getMethods();

        try{
            //遍历获取到的方法
            for(Method method: methods){
                //如果此方法有注解，就把注解里面的数据赋值到User对象中
                if(method.isAnnotationPresent(Init.class)){
                    Init init = method.getAnnotation(Init.class);
                    System.out.println(init);
                    method.invoke(user, init.value());
                }
            }
        }catch (Exception e){
            logger.info(e.getMessage());
        }

        return user;

    }
}
