package com.deaifish.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @className HelloController
 * @author DEAiFISH
 * @date 2023/7/31 14:51
 */
@RestController
@Slf4j //自动导入 logger
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/h")
    public String hello(){
        log.info("哈哈");
        return "hello";
    }
}
