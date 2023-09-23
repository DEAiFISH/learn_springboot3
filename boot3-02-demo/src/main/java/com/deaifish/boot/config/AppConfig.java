package com.deaifish.boot.config;

import com.alibaba.druid.FastsqlException;
import com.deaifish.boot.bean.Sheep;
import com.deaifish.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @description TODO
 *
 * @className AppConfig
 * @author DEAiFISH
 * @date 2023/7/31 10:27
 */
@Import(FastsqlException.class) //给容器中放指定类型的组件，组件名字默认是全类名
@Configuration  //这是一个配置类，替代以前的配置文件
@SpringBootConfiguration //Spring配置类，两个差不多

/*
    @ConfigurationProperties： 声明组件的属性和配置文件哪些前缀开始项进行绑定
    @EnableConfigurationProperties：快速注册注解：
    1、开启sheep组件的属性绑定
    2、默认把组件（sheep）放到容器中
 */
@EnableConfigurationProperties(Sheep.class) //用于导入第三方写好的组件进行属性绑定
/*
    SpringBoot默认只扫描自己主程序所在的包。
    如果导入第三方包，即使组件上标注了 @Component、@ConfigurationProperties 注解，也没用。
    因为组件都扫描不进来，此时使用这个注解就可以快速进行属性绑定并把组件注册进容器
 */
public class AppConfig {

    /**
     * 1、组件默认是单实例
     *
     */
    @Scope("prototype")
    @Bean("userHaha")   //替代以前的Bean标签，组件在容器中名字默认是方法名，特可以直接修改注解的值
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("1");
        return user;
    }

    /*@Bean
    public FastsqlException fastSqlException(){
        return new FastsqlException();
    }*/
}
