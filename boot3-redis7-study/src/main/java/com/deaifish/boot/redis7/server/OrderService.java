package com.deaifish.boot.redis7.server;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @description TODO
 *
 * @className OrderService
 * @author DEAiFISH
 * @date 2023/9/23 14:45
 */
@Service
@Slf4j
public class OrderService {
    public static final String ORDER_KEY = "ord:";
    @Resource
//    private RedisTemplate redisTemplate;
    private StringRedisTemplate stringRedisTemplate;

    public void addOrder() {
        int keyId = ThreadLocalRandom.current().nextInt(1000) + 1;
        String serialNo = UUID.randomUUID().toString();

        String key = ORDER_KEY + keyId;
        String value = "京东订单：" + serialNo;

        stringRedisTemplate.opsForValue().set(key, value);

        log.info("===key{}", key);
        log.info("===value{}", value);
    }

    public String getOrderById(Integer Id) {
        return stringRedisTemplate.opsForValue().get(ORDER_KEY + Id);
    }
}
