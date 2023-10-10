package org.deaifish.boot3.core.event;

import org.deaifish.boot3.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @description 事件发出器
 *
 * @className EventPublisher
 * @author DEAiFISH
 * @date 2023/10/10 16:55
 */
public class EventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendEvent(ApplicationEvent event){
        //调用底层API，把事件发送出去
        applicationEventPublisher.publishEvent(event);
    }

    /**
     * @description 会自动调用，把真正发送事件的底层组件给我
     *
     * @author DEAiFISH
     * @date 2023/10/10 16:57
     * @param applicationEventPublisher
     * @return void
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
