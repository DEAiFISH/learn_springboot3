package com.deaifish.boot.redis7.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/11 22:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person  implements Serializable {
    private Long id;
    private String name;
    private Integer age;
}
