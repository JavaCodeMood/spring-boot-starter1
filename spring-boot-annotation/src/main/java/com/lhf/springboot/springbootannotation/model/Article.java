package com.lhf.springboot.springbootannotation.model;

import com.lhf.springboot.springbootannotation.annotation.Validate;

/**
 * @ClassName: Article
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/14 17:40
 */
public class Article {

    @Validate(isNotNull = false)
    private String aid;

    @Validate(min= 4, max = 16)
    private String content;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "aid='" + aid + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
