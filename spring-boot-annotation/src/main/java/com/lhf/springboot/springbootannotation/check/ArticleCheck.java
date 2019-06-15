package com.lhf.springboot.springbootannotation.check;

import com.lhf.springboot.springbootannotation.annotation.Validate;
import com.lhf.springboot.springbootannotation.model.Article;

import java.lang.reflect.Field;

/**
 * @ClassName: ArticleCheck
 * @Author: liuhefei
 * @Description:  注解解析器
 * @Date: 2019/5/14 17:42
 */
public class ArticleCheck {

    public static boolean check(Article article){
        if(article == null){
            System.out.println("校验的对象为空！");
            return false;
        }

        //获取Article类的所有属性，（如果使用getFields，就无法获取到private的属性）
        Field[] fields = Article.class.getDeclaredFields();
        for(Field field : fields){
            //如果属性有注解，就进行校验
            if(field.isAnnotationPresent(Validate.class)){
                Validate validate = field.getAnnotation(Validate.class);
                if (field.getName().equals("aid"))
                {
                    if (article.getAid() == null)
                    {
                        if (validate.isNotNull())
                        {
                            System.out.println("文章编号可空校验不通过：不可为空！！");
                            return false;
                        }
                        else
                        {
                            System.out.println("文章编号可空校验通过：可以为空");
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("文章编号可空校验通过");
                    }

                    if (article.getAid().length() < validate.min())
                    {
                        System.out.println("文章编号最小长度校验不通过！！");
                        return false;
                    }
                    else
                    {
                        System.out.println("文章编号最小长度校验通过");
                    }

                    if (article.getAid().length() > validate.max())
                    {
                        System.out.println("文章编号最大长度校验不通过！！");
                        return false;
                    }
                    else
                    {
                        System.out.println("文章编号最大长度校验通过");
                    }
                }

                if (field.getName().equals("content")) {
                    if (article.getContent() == null)
                    {
                        if (validate.isNotNull())
                        {
                            System.out.println("文章内容可空校验不通过：不可为空！！");
                            return false;
                        }
                        else
                        {
                            System.out.println("文章内容可空校验通过：可以为空");
                            continue;
                        }
                    }
                    else
                    {
                        System.out.println("文章内容可空校验通过");
                    }

                    if (article.getContent().length() < validate.min())
                    {
                        System.out.println("文章内容最小长度校验不通过！！");
                        return false;
                    }
                    else
                    {
                        System.out.println("文章内容最小长度校验通过");
                    }

                    if (article.getContent().length() > validate.max())
                    {
                        System.out.println("文章内容最大长度校验不通过！！");
                        return false;
                    }
                    else
                    {
                        System.out.println("文章内容最大长度校验通过");
                    }
                }
            }
        }
        return true;
    }
}
