package com.dubbo.controller;

import demo.apii.UserService;
import demo.apii.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/04 15:34
 */
@RestController
@RequestMapping("/provied")
public class ProviedController {
    @Resource
    UserService userService;


    @GetMapping("/user")
    public UserVO user(@RequestParam("userId") String userId) {
        return userService.getUserInfo();
    }
}
