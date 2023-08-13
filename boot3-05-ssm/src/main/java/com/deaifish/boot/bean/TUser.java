package com.deaifish.boot.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description TODO
 *
 * @className TUser
 * @author DEAiFISH
 * @date 2023/8/12 19:37
 */
@JacksonXmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class TUser {
    private int id;
    private String userName;
    private int balance;
}
