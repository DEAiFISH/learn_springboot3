package com.deaifish.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description TODO
 *
 * @className Child
 * @author DEAiFISH
 * @date 2023/7/31 14:09
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text; //数组
}
