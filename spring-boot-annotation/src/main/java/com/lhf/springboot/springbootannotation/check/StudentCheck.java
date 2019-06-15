package com.lhf.springboot.springbootannotation.check;

import com.lhf.springboot.springbootannotation.annotation.Column;
import com.lhf.springboot.springbootannotation.annotation.Table;
import com.lhf.springboot.springbootannotation.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: StudentCheck
 * @Author: liuhefei
 * @Description: 注解解析器
 * @Date: 2019/5/14 18:29
 */
public class StudentCheck {

    public static String query(Student student){
        StringBuilder sb = new StringBuilder();
        Class<?> studentClass = student.getClass();
        boolean tableAnnoExits = studentClass.isAnnotationPresent(Table.class);
        //判断studentClass对象上是否有@Table注解
        if(!tableAnnoExits){
            return "不存在注解";
        }

        //获取@Table注解中的表名，拼接SQL
        Table table = studentClass.getAnnotation(Table.class);
        String tableName = table.value();
        sb.append("SELECT * FROM " + tableName + " WHERE 1 = 1");

        //获取studentClass对象上的所有字段并遍历
        Field[] fields = studentClass.getDeclaredFields();
        try{
           for(Field field : fields){
               boolean fieldAnnoExits = field.isAnnotationPresent(Column.class);
               //判断字段上是否含有@Column注解
               if(!fieldAnnoExits){
                   continue;
               }
               //获取注解中的字段名
               Column column = field.getAnnotation(Column.class);
               String columnName = column.value();

               //通过get()方法获取传入的字段值
               String fieldName = field.getName();  //属性名字
               String getMethodName = "get" + fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);  //方法名
               Method method = studentClass.getMethod(getMethodName);
               Object fieldValue = method.invoke(student);

               if(fieldValue == null || (fieldValue instanceof  Integer && (Integer)fieldValue == 0)){
                   continue;
               }

               //接着拼接SQL语句
               sb.append(" AND " ).append(columnName).append(" = ");
               if(fieldValue instanceof String){
                   sb.append("'").append(fieldValue).append("'");
               }else if(fieldValue instanceof Integer){
                   sb.append(fieldValue);
               }
           }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
