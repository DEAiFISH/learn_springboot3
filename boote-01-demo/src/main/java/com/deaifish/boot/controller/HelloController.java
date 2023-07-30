package com.deaifish.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 *
 * @className: HelloController
 * @author: DEAiFISH
 * @date: 2023/7/30 14:31
 */

/*
    方法一：
    @Controller
    @ResponseBody
*/

//  方法二： 整合两个注解
@RestController
public class HelloController {
    /**
     * @description: TODO
     * @author: DEAiFISH
     * @date: 2023/7/30 14:32
     * @return: java.lang.String
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello,Spring Boot 3!";
    }
}
