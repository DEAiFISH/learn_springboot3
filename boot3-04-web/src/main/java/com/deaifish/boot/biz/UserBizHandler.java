package com.deaifish.boot.biz;

import com.deaifish.boot.bean.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @description TODO
 *
 * @className UserBizHandler
 * @author DEAiFISH
 * @date 2023/8/7 11:41
 */
@Service
public class UserBizHandler {
    /**
     * @description 查询指定id的用户
     *
     * @author DEAiFISH
     * @date 2023/8/7 11:42
     * @return org.springframework.web.servlet.function.ServerResponse
     */
    public ServerResponse getUser(ServerRequest request) throws Exception{
        //业务处理
        Person person = new Person(1L, "哈哈", "123", 12);
        //构造响应
        return ServerResponse.ok().body(person);
    }
}
