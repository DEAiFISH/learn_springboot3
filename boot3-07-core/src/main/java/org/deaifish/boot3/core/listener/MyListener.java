package org.deaifish.boot3.core.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @description TODO
 *
 * @className MyListener
 * @author DEAiFISH
 * @date 2023/10/10 19:35
 */
public class MyListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("=====事件到达======" + event);
    }
}
