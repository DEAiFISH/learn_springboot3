package com.deaifish.boot.redis7.demo;

import redis.clients.jedis.Jedis;

/**
 * @description TODO
 *
 * @className JedisDemo
 * @author DEAiFISH
 * @date 2023/9/19 15:55
 */
public class JedisDemo {
    public static void main(String[] args) {
        //1 connection获得，通过指定端口号
        Jedis jedis = new Jedis("172.20.10.2", 6379);

        //2 指定访问服务器密码
        jedis.auth("root");

        //3 获得了jedis客户端，可以像jdbc一样，访问我们的redis
        System.out.println(jedis.ping());

        //keys
        System.out.println(jedis.keys("*"));

        //string
        jedis.set("k3","hello");
        jedis.expire("k3",20L);

        //list
        jedis.lpush("list","11","22","33");
    }
}
