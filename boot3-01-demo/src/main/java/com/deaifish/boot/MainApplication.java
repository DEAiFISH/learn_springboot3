package com.deaifish.boot;

import com.deaifish.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);

        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }
}
