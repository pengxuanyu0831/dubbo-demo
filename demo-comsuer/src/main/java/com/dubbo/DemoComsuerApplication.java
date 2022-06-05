package com.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program dubbo-demo
 * @description:
 * @author: pengxuanyu
 * @create: 2022/06/05 17:26
 */

@SpringBootApplication
@EnableDubbo
public class DemoComsuerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoComsuerApplication.class);
        System.out.println("消费者启动。。。。");
    }
}
