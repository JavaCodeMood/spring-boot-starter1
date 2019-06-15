package com.lhf.springboot.springbootannotation.model;

import com.lhf.springboot.springbootannotation.annotation.Description;
import com.lhf.springboot.springbootannotation.annotation.Init;

/**
 * @ClassName: User
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 16:55
 */
@Description(desc = "用户类", author = "liuhefei")
public class User {

    private String name;

    private String iphone;

    public String getName() {
        return name;
    }

    @Init(value = "刘豆豆")
    public void setName(String name) {
        this.name = name;
    }

    public String getIphone() {
        return iphone;
    }

    @Init(value = "18295514444")
    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    @Description(desc = "用户信息", author = "张三")
    public String userInfo(){
        return "用户信息";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", iphone='" + iphone + '\'' +
                '}';
    }
}
