package com.deaifish.boot.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description TODO
 *
 * @className Person
 * @author DEAiFISH
 * @date 2023/8/2 20:25
 */
@JacksonXmlRootElement  // 可以写出为xml文档
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private Long id;
    private String userName;
    private String email;
    private Integer age;
}