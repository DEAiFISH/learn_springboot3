package com.deaifish.boot.config;

import com.alibaba.druid.FastsqlException;
import com.deaifish.boot.bean.Cat;
import com.deaifish.boot.bean.Dog;
import com.deaifish.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;


/**
 * @description TODO
 *
 * @className AppConfig2
 * @author DEAiFISH
 * @date 2023/7/31 10:56
 */
@SpringBootConfiguration
public class AppConfig2 {

    /*
            注意：放在类级别，如果注解判断生效，整个配置类才生效；方法级别同理

        @ConditionalOnClass：如果类路径中存在这个类，则触发指定行为
        @ConditionalOnMissingClass：如果类路径中不存在这个类，则触发指定行为
        @ConditionalOnBean：如果容器中存在这个Bean（组件），则触发指定行为
        @ConditionalOnMissingBean：如果容器中不存在这个Bean（组件），则触发指定行为
     */
    @ConditionalOnClass(FastsqlException.class)
    @Bean
    public Cat cat01() {
        return new Cat();
    }

    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(name = "dog01")
    @Bean
    public User zhangsan(){
        return new User();
    }

    @ConditionalOnMissingBean(name = "dog01")
    @Bean
    public User lisi(){
        return new User();
    }
}
