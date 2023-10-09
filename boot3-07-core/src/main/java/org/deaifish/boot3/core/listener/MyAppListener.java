package org.deaifish.boot3.core.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * @description TODO
 *
 * @className MyAppListener
 * @author DEAiFISH
 * @date 2023/10/9 15:00
 */
public class MyAppListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("=====starting=====程序正在启动=====");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("=====environmentPrepared=====环境准备完成=====");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("=====contextPrepared=====ioc容器准备完成=====");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("=====contextLoaded=====ioc容器加载完成=====");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("=====started=====启动完成=====");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("=====ready=====准备就绪=====");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("=====failed=====应用启动失败=====");
    }
}
