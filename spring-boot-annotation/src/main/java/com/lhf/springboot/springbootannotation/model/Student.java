package com.lhf.springboot.springbootannotation.model;

import com.lhf.springboot.springbootannotation.annotation.Column;
import com.lhf.springboot.springbootannotation.annotation.Table;

/**
 * @ClassName: Student
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 18:26
 */
@Table("student")
public class Student {

    @Column("id")
    private Integer id;

    @Column("stu_name")
    private String stuName;

    @Column("age")
    private int age;

    @Column("phone")
    private String phone;

    @Column("city")
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
