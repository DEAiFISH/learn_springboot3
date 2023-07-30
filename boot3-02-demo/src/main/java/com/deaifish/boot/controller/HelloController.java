package com.deaifish.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @className HelloController
 * @author DEAiFISH
 * @date 2023/7/30 15:20
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
