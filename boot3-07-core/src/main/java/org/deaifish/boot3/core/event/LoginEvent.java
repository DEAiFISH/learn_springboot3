package org.deaifish.boot3.core.event;

import org.deaifish.boot3.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * @description 登录成功事件
 *
 * @className LoginEvent
 * @author DEAiFISH
 * @date 2023/10/10 16:51
 */

public class LoginEvent extends ApplicationEvent {
    public LoginEvent(UserEntity source) {
        super(source);
    }
}
