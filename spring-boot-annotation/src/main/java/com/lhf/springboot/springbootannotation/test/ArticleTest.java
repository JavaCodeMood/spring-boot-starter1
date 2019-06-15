package com.lhf.springboot.springbootannotation.test;

import com.lhf.springboot.springbootannotation.check.ArticleCheck;
import com.lhf.springboot.springbootannotation.model.Article;

/**
 * @ClassName: ArticleTest
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 17:56
 */
public class ArticleTest {

    public static void main(String[] args) {
        Article article = new Article();
        article.setAid("1234");
        article.setContent("将近酒杯莫停");
        System.out.println(article);
        System.out.println(ArticleCheck.check(article));
    }
}
