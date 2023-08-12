package com.deaifish.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description TODO
 *
 * @className BootApplication
 * @author DEAiFISH
 * @date 2023/8/12 19:45
 */

//告诉mybatis扫描哪个包下面的所有接口
//告诉mybatis所有接口的xml文件在哪
@MapperScan(basePackages = "com.deaifish.boot.mapper")
@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
