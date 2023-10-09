package org.deaifish.boot3.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @className HelloController
 * @author DEAiFISH
 * @date 2023/10/9 17:18
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
