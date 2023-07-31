package com.deaifish.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description TODO
 *
 * @className Person
 * @author DEAiFISH
 * @date 2023/7/31 14:07
 */
@Component
@ConfigurationProperties("person")
@Data //自动生成get/set方法
public class Person {
    private String name;
    private Integer age;
    private Date birthDay;
    private Boolean like;
    private Child child; //嵌套对象
    private List<Dog> dogs;//数组（里面是对象）
    private Map<String,Cat> cats;//表示Map

}
