package com.deaifish.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description TODO
 *
 * @className MainApplication
 * @author DEAiFISH
 * @date 2023/7/30 14:37
 */
@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        //固定写法
        SpringApplication.run(MainApplication.class, args);
    }
}
