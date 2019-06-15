package com.lhf.springboot.springbootannotation.test;

import com.lhf.springboot.springbootannotation.check.StudentCheck;
import com.lhf.springboot.springbootannotation.model.Student;

/**
 * @ClassName: StudentTest
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 18:48
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setStuName("刘豆豆");
        student1.setAge(20);
        student1.setPhone("18295518888");
        student1.setCity("北京");
        String str1 = StudentCheck.query(student1);
        System.out.println(str1);

        Student student2 = new Student();
        student2.setStuName("霜花");
        student2.setCity("深圳");
        String str2 = StudentCheck.query(student2);
        System.out.println(str2);

    }
}
