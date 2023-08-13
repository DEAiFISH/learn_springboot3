package com.deaifish.boot.controller;

import com.deaifish.boot.bean.TUser;
import com.deaifish.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @className UserController
 * @author DEAiFISH
 * @date 2023/8/12 19:50
 */
@RestController()
public class UserController {
    @Autowired
    private UserMapper userMapper;

    /**
     * @description 以json返回
     *
     * @author DEAiFISH
     * @date 2023/8/12 19:53
     * @param id
     * @return com.deaifish.boot.bean.TUser
     */
    @GetMapping(value = "/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public TUser getUser(@PathVariable("id") int id){
        return userMapper.getUserById(id);
    }
}
