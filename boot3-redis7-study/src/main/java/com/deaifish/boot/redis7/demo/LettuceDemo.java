package com.deaifish.boot.redis7.demo;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

import java.util.HashMap;

/**
 * @description TODO
 *
 * @className LettuceDemo
 * @author DEAiFISH
 * @date 2023/9/19 16:17
 */
public class LettuceDemo {
    public static void main(String[] args) {
        //1 使用构建器链式编程builder我们RedisURI
        RedisURI uri = RedisURI.Builder.redis("172.20.10.2").withPort(6379).withAuthentication("default", "root").build();

        //2 创建连接客户端
        RedisClient redisClient = RedisClient.create(uri);
        StatefulRedisConnection<String, String> connect = redisClient.connect();


        //3 通过connect创建操作的command
        RedisCommands<String, String> commands = connect.sync();

        //==============================

        //keys
        System.out.println(commands.keys("*"));

        //string
        System.out.println(commands.get("k3"));

        //hash
        commands.sadd("set","123","234");

        //hashmap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","clr");
        hashMap.put("age","21");
        hashMap.put("des","猪头");
        commands.hset("user:002",hashMap);
        System.out.println(commands.hgetall("user:002"));

        //==============================

        //4 各种关闭释放资源
        connect.close();
        redisClient.shutdown();

    }
}
