package com.lhf.springboot.config;

import com.lhf.springboot.properties.StringProperties;
import com.lhf.springboot.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: StringAutoConfiguration
 * @Author: liuhefei
 * @Description: 自动化配置类,用于生成Bean，并注册到Bean管理器中
 * @Date: 2019/5/13 11:49
 */
// 定义 java 配置类
@Configuration
//引入StringService
@ConditionalOnClass({StringService.class})
// 将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
@EnableConfigurationProperties(StringProperties.class)
public class StringAutoConfiguration {

    // 注入属性类
    @Autowired
    private StringProperties stringProperties;

    @Bean
    // 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(StringService.class)
    public StringService helloworldService() {
        StringService stringService = new StringService();
        stringService.setStr1(stringProperties.getStr1());
        stringService.setStr2(stringProperties.getStr2());
        return stringService;
    }

}
