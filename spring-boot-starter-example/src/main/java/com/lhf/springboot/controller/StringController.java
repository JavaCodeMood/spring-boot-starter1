package com.lhf.springboot.controller;

import com.lhf.springboot.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: StringController
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2019/5/13 12:42
 */
@RestController
public class StringController {

    @Autowired
    private StringService stringService;

    @RequestMapping("/")
    public String addString(){
        return stringService.addStr();
    }
}
