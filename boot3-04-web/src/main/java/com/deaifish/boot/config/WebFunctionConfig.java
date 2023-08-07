package com.deaifish.boot.config;

import com.deaifish.boot.bean.Person;
import com.deaifish.boot.biz.UserBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @description
 *  场景：User RESTful - CRUD
 * ● GET /user/1  获取1号用户
 * ● GET /users   获取所有用户
 * ● POST /user  请求体携带JSON，新增一个用户
 * ● PUT /user/1 请求体携带JSON，修改1号用户
 * ● DELETE /user/1 删除1号用户
 *
 * @className WebFunctionConfig
 * @author DEAiFISH
 * @date 2023/8/7 11:32
 */
@Configuration
public class WebFunctionConfig {

    /**
     * @description
     * 函数式web：
     *  1、给容器中放一个Bean：类型是 RouterFunction<ServerResponse>
     *  2、每个业务准备一个自己的Handler
     *
     *
     *  核心四大对象
     *  1、RouterFunction：   定义路由信息。发什么请求
     *  2、RequestPredicate： 定义请求：请求谓语。请求方式（GET、POST）、请求参数
     *  3、ServerRequest：    封装请求完整数据
     *  4、ServerResponse：   封装响应完整数据
     *
     * @author DEAiFISH
     * @date 2023/8/7 11:34
     */
    @Bean
    public RouterFunction<ServerResponse> userRoute(UserBizHandler userBizHandler /*这个会被自动注入*/){

        return RouterFunctions.route()//开启定义路由信息
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL),userBizHandler::getUser)
                .build();
    }

}
