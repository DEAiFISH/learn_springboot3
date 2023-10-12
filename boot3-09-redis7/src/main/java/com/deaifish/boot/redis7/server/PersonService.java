package com.deaifish.boot.redis7.server;

import com.deaifish.boot.redis7.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/11 22:09
 */
@Service
public class PersonService{
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    public String savePerson(){
        Person person = new Person(1L,"cxx",21);
        //1、序列化：对象转换为JSON方式
        redisTemplate.opsForValue().set("person",person);

        return "ok";
    }

    public Person getPerson(){
        return (Person) redisTemplate.opsForValue().get("person");
    }
}
