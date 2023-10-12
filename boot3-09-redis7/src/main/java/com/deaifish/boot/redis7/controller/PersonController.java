package com.deaifish.boot.redis7.controller;

import com.deaifish.boot.redis7.bean.Person;
import com.deaifish.boot.redis7.server.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/11 22:09
 */
@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/person/save")
    public String savePerson(){
        return personService.savePerson();
    }

    @GetMapping("/person/get")
    public Person getPerson(){
        return personService.getPerson();
    }
}
