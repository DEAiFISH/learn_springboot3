package com.deaifish.boot.redis7.controller;

import com.deaifish.boot.redis7.server.OrderService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @Resource
    private OrderService orderService;

    @RequestMapping(value = "order/add",method = RequestMethod.POST)
    public void addOrder(){
        orderService.addOrder();
    }

    @RequestMapping(value = "order/{keyId}", method = RequestMethod.GET)
    public String getOrderById(@PathVariable Integer keyId){
        return orderService.getOrderById(keyId);
    }
}
