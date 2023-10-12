package com.deaifish.boot.redis7.controller;

import com.deaifish.boot.redis7.server.OrderService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description TODO
 *
 * @className OrderController
 * @author DEAiFISH
 * @date 2023/9/23 15:02
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/add")
    public void addOrder(){
        orderService.addOrder();
    }

    @GetMapping("/order/{keyId}")
    public String getOrderById(@PathVariable Integer keyId){
        return orderService.getOrderById(keyId);
    }
}
