package org.deaifish.boot3.core.service;

import org.deaifish.boot3.core.entity.UserEntity;
import org.deaifish.boot3.core.event.LoginEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @description TODO
 *
 * @className CouponService
 * @author DEAiFISH
 * @date 2023/10/10 16:26
 */
@Service
public class CouponService {

    @Order(1)
    @EventListener
    public void onEvent(LoginEvent loginSuccessEvent){
        System.out.println("===== CouponService ====感知到事件"+loginSuccessEvent);
        UserEntity source = (UserEntity) loginSuccessEvent.getSource();
        sendCoupon(source.getUserName());
    }

    public void sendCoupon(String username){
        System.out.println(username + " 随机得到了一张优惠券");
    }
}
