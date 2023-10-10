package org.deaifish.boot3.core.service;

import org.deaifish.boot3.core.entity.UserEntity;
import org.deaifish.boot3.core.event.LoginEvent;
import org.springframework.context.event.EventListener;
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
    @EventListener
    public void onEvent(LoginEvent loginEvent){
        UserEntity userEntity = (UserEntity) loginEvent.getSource();
        sendCoupon(userEntity.getUserName());
    }
    public void sendCoupon(String userName){
        System.out.println(userName + "送出一张优惠卷。。。");
    }
}
