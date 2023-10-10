package org.deaifish.boot3.core.controller;

import org.deaifish.boot3.core.entity.UserEntity;
import org.deaifish.boot3.core.event.LoginEvent;
import org.deaifish.boot3.core.service.AccountService;
import org.deaifish.boot3.core.service.CouponService;
import org.deaifish.boot3.core.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description TODO
 *
 * @className LoginController
 * @author DEAiFISH
 * @date 2023/10/10 16:22
 */
@RestController
public class LoginController {

    @Autowired
    AccountService accountService;
    @Autowired
    CouponService couponService;
    @Autowired
    SysService sysService;

    @GetMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("passwd") String passwd){

        //业务处理登录
        System.out.println("业务处理登录完成。。。");

        //发送事件
        //创建事件信息
        new LoginEvent(new UserEntity(userName,passwd));
        //发送事件信息



        /*//1、签到加分
//        System.out.println(userName + "加了1分。。。");
        accountService.accountService(userName);

        //2、发放优惠卷
//        System.out.println(userName + "送出一张优惠卷。。。");
        couponService.sendCoupon(userName);

        //3、登录信息
//        System.out.println(userName + "登录日志记录完成。。。");
        sysService.recordeLog(userName);*/

        return userName + "登录成功";
    }
}
