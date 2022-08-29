package com.dubbo.service;

import demo.apii.UserService;
import demo.apii.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/04 14:46
 */
@DubboService(version = "1.0.0",protocol = "dubbo")
@Slf4j
@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserVO getUserInfo() {
        log.info("from module provied");
        UserVO vo = UserVO.builder()
                .name("张三")
                .userAddress("皇后大道")
                .userPhone("13712344123")
                .build();
        return vo;
    }
}
