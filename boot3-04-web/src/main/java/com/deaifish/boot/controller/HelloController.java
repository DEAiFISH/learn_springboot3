package com.deaifish.boot.controller;

import com.deaifish.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description TODO
 *
 * @className HelloController
 * @author DEAiFISH
 * @date 2023/8/2 20:25
 */
@RestController
@Slf4j
public class HelloController {
    /**
     * @description
     *  1.默认支持把对象写为json，因为默认web场景导入了jackson处理json的包；jackson-core
     *  2.jason也支持把数据写为xml。导入xml相关依赖
     *
     * @author DEAiFISH
     * @date 2023/8/2 20:28
     * @return com.deaifish.boot.bean.Person
     */
    @GetMapping("/person")
    public Person person() {
        Person person = new Person(1L, "cxx", "123", 10);
        log.info(person.toString());
        int i = 10 / 0;
        return person;
    }

}
