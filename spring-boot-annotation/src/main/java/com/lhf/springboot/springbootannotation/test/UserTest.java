package com.lhf.springboot.springbootannotation.test;

import com.lhf.springboot.springbootannotation.check.UserCheck;
import com.lhf.springboot.springbootannotation.model.User;

/**
 * @ClassName: UserTest
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 17:17
 */
public class UserTest {

    public static void main(String[] args) {
        User user = UserCheck.create();
        System.out.println(user);
        System.out.println(user.getIphone());
    }
}
