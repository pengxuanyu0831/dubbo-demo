package com.dubbo.controller;

import demo.apii.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/05 17:23
 */
@RestController
@Slf4j
@RequestMapping("/comsuer")
public class ComsuerController {

    @DubboReference(version = "1.0.0",protocol = "dubbo",loadbalance = "random")
    private UserService userService;

    @GetMapping("/getUserInfo1")
    public String getUserInfo1() {
        return userService.getUserInfo().toString();
    }
}
