package com.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/04 15:33
 */
@SpringBootApplication
@EnableDubbo
public class DemoProviedApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoProviedApplication.class);
    }
}
