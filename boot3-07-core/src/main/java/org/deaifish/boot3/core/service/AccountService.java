package org.deaifish.boot3.core.service;

import org.deaifish.boot3.core.entity.UserEntity;
import org.deaifish.boot3.core.event.LoginEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @description TODO
 *
 * @className AccountService
 * @author DEAiFISH
 * @date 2023/10/10 16:25
 */
@Service
public class AccountService implements ApplicationListener<LoginEvent> {
    public void accountService(String userName){
        System.out.println(userName + "加了1分。。。");
    }

    @Override
    public void onApplicationEvent(LoginEvent event) {
        String userName = ((UserEntity)event.getSource()).getUserName();
        accountService(userName);
    }
}
